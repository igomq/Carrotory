package io.github.igomq.carrotory.Utility;

import net.minecraft.server.v1_16_R3.NBTTagCompound;
import net.minecraft.server.v1_16_R3.NBTTagInt;
import net.minecraft.server.v1_16_R3.NBTTagString;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Random;

import static io.github.igomq.carrotory.Utility.Info.equipmentList;
import static io.github.igomq.carrotory.Utility.Info.percentage;

public class Reinforce {
    public ItemStack reinforce(ItemStack reinforceItem, Player who) {
        boolean isAllowedEquipment = false;
        byte itemType = 0;
        for (Material[] m : equipmentList) {
            for (Material mm : m) {
                if (reinforceItem.getType().equals(mm)) {
                    isAllowedEquipment = true;
                    itemType = (byte)Arrays.asList(equipmentList).indexOf(m);
                    break;
                }
            }
        }

        if(!isAllowedEquipment) {
            who.sendRawMessage(ChatColor.DARK_RED + "That item is now allowed to reinforce!");
            return reinforceItem;
        }
        // ☆ : ★
        ItemMeta meta = reinforceItem.getItemMeta();

        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(reinforceItem);
        if (nmsItem.hasTag()) {
            NBTTagCompound itemCompound = new NBTTagCompound();

            itemCompound.set("itemLevel", NBTTagInt.a(0));
            nmsItem.setTag(itemCompound);
        }

        assert nmsItem.getTag() != null;
        byte itemLevel = (byte)nmsItem.getTag().getInt("itemLevel");

        NBTTagCompound itemCompound = nmsItem.getTag();

        int level = itemLevel;
        switch (roll(itemType, itemLevel)) {
            case 0: level = 0;
                break;
            case 1: level += 1;
                break;
            case 2: break;

            default: level -= 1;
                break;
        }

        itemCompound.set("itemLevel", NBTTagInt.a(level));
        ItemStack item = CraftItemStack.asBukkitCopy(nmsItem);

        if (level == 0) item.setType(Material.AIR);
        return item;
    }

    private byte roll(byte type, byte level) {
        Random r = new Random();
        int p = r.nextInt(100);

        int[] percentages = percentage[type][level];
        int len = percentages.length;
        if (len == 3) {
            if (p <= percentages[0]) return 1;
            else if (p <= (percentages[0]+percentages[1])) return 2;
            else if (p <= (percentages[0]+percentages[1]+percentages[2])) return -1;
        } else if (len == 4) {
            if (p <= percentages[0]) return 1;
            else if (p <= (percentages[0]+percentages[1])) return 2;
            else if (p <= (percentages[0]+percentages[1]+percentages[2])) return -1;
            else return 0;
        }
        return 2;
    }
}
