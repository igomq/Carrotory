package io.github.igomq.carrotory.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class EnchantmentGUI{
    public final Inventory enchantmentInventory;

    @SuppressWarnings("deprecation")
    public EnchantmentGUI() {
        enchantmentInventory = Bukkit.createInventory(null, 9, "Enchant");

        initInventory();
    }

    @SuppressWarnings("deprecation")
    public void initInventory() {
        for (int i=0; i<9; i++) {
            if (i>=3 && i<6) {
                Material material = i==3 ? Material.GREEN_STAINED_GLASS_PANE : i==4 ? Material.AIR : Material.RED_STAINED_GLASS_PANE;
                String itemName = "";
                if (i!=4) itemName = i==3 ? "Enchant" : "Cancel";

                enchantmentInventory.setItem(i, createGUIItem(material, itemName, ""));
                continue;
            }

            enchantmentInventory.setItem(i, createGUIItem(Material.ENCHANTING_TABLE, "", ""));
        }
    }

    @SuppressWarnings("deprecation")
    protected ItemStack createGUIItem (Material material, String itemName, String itemLore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        if (!itemName.equals("")) meta.setDisplayName(itemName);
        if (!itemLore.equals("")) meta.setLore(Collections.singletonList(itemLore));

        item.setItemMeta(meta);
        return item;
    }

    public void openInventory(final HumanEntity human) {
        human.openInventory(enchantmentInventory);
    }
}
