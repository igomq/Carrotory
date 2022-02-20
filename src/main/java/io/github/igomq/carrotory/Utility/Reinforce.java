package io.github.igomq.carrotory.Utility;

import net.minecraft.server.v1_16_R3.NBTTagCompound;
import net.minecraft.server.v1_16_R3.NBTTagInt;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static io.github.igomq.carrotory.Info.Info.equipmentList;
import static io.github.igomq.carrotory.Info.Info.percentage;

public class Reinforce {
    @SuppressWarnings("deprecation")
    public ItemStack reinforce(ItemStack reinforceItem, Player who) {
        boolean isCorrectItem = false;
        int itemType = 0;
        for (int i = 0; i<equipmentList.length; i++) {
            for (int j = 0; j<equipmentList[i].length; j++) {
                if (equipmentList[i][j].equals(reinforceItem.getType())) { itemType = i; isCorrectItem = true; }
            }
        }
        // ☆ : ★
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(reinforceItem);
        if (nmsItem.getTag() != null && !nmsItem.getTag().hasKey("itemLevel")) {
            NBTTagCompound itemCompound = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();

            itemCompound.set("itemLevel", NBTTagInt.a(0));
            nmsItem.setTag(itemCompound);
        }

        if(!isCorrectItem)
            { who.sendMessage(ChatColor.DARK_RED + "That item is not allowed to reinforce!"); return reinforceItem; }

        assert nmsItem.getTag() != null;
        byte itemLevel = (byte)nmsItem.getTag().getInt("itemLevel");
        if (itemLevel >= percentage[itemType].length)
            { who.sendMessage(ChatColor.DARK_RED + "Reached Max Reinforce level!"); return reinforceItem; }

        NBTTagCompound itemCompound = nmsItem.getTag();

        int level = itemLevel;

        // TODO Add custom effect by itemType / itemLevel
        // TODO Add scroll system
        switch (roll(itemType, itemLevel)) {
            case 0: level = 0;
                who.playSound(who.getLocation(), Sound.BLOCK_ANVIL_BREAK, 2.0F, 1.0F);
                break;
            case 1: level += 1;
                who.playSound(who.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0F, 1.0F);
                break;
            case 2: who.playSound(who.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0F, 1.0F); break;
            default: level -= 1;
                who.playSound(who.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0F, 1.0F);
                break;
        }

        itemCompound.set("itemLevel", NBTTagInt.a(level));
        ItemStack item = CraftItemStack.asBukkitCopy(nmsItem);

        ItemMeta im = nmsItem.asBukkitCopy().getItemMeta();

        StringBuilder coloredStarBuilder = new StringBuilder();
        for (int i=0; i<level; i++) coloredStarBuilder.append("★");
        String coloredStar = coloredStarBuilder.toString();

        StringBuilder notColoredStarBuilder = new StringBuilder();
        for (int i=0; i<(percentage[itemType].length-level); i++) notColoredStarBuilder.append("☆");
        String notColoredStar = notColoredStarBuilder.toString();

        im.setLore(Collections.singletonList(
                ChatColor.YELLOW + coloredStar + notColoredStar
        ));

        item.setItemMeta(im);

        if (level == 0) item.setType(Material.AIR);
        return item;
    }

    private byte roll(int type, byte level) {
        Random r = new Random();
        int p = r.nextInt(100);

        int[] percentages = percentage[type][level];
        int len = percentages.length;
        if(level == percentage[type].length) return 2;
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
