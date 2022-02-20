package io.github.igomq.carrotory.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class AnvilGUI{
    public final Inventory anvilInventory;

    @SuppressWarnings("deprecation")
    public AnvilGUI() {
        anvilInventory = Bukkit.createInventory(null, 9, "Reinforce");

        initInventory();
    }

    public void initInventory() {
        for (int i=0; i<9; i++) {
            /*  Integer "i"
                ~2 Anvil
                3 Green stained-glass pane
                4 Air (Where the item goes)
                5 Red stained-glass pane
                6~ Anvil
             */

            if (i>=3 && i<6) {
                Material material = i==3 ? Material.GREEN_STAINED_GLASS_PANE : i==4 ? Material.AIR : Material.RED_STAINED_GLASS_PANE;
                String itemName = "";
                if (i!=4) itemName = i==3 ? "Reinforce" : "Cancel";

                anvilInventory.setItem(i, createGUIItem(material, itemName, ""));
                continue;
            }

            anvilInventory.setItem(i, createGUIItem(Material.ANVIL, "", ""));
        }
    }

    @SuppressWarnings("deprecation")
    protected ItemStack createGUIItem (Material material, String itemName, String itemLore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        assert meta != null;
        if (!itemName.equals("")) meta.setDisplayName(itemName);
        if (!itemLore.equals("")) meta.setLore(Collections.singletonList(itemLore));

        item.setItemMeta(meta);
        return item;
    }

    public void openInventory(final HumanEntity human) {
        human.openInventory(anvilInventory);
    }
}
