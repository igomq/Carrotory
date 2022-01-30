package io.github.igomq.carrotory.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class EnchantmentGUI implements Listener {
    public final Inventory enchantmentInventory;

    public EnchantmentGUI() {
        enchantmentInventory = Bukkit.createInventory(null, 9, "Reinforce");

        initInventory();
    }

    public void initInventory() {
        for (int i=0; i<9; i++) {
            if (i>=3 && i<6) {
                Material material = i==3 ? Material.GREEN_STAINED_GLASS_PANE : i==4 ? Material.AIR : Material.RED_STAINED_GLASS_PANE;
                String itemName = "";
                if (i!=4) itemName = i==3 ? "Reinforce" : "Cancel";

                enchantmentInventory.addItem(createGUIItem(material, itemName, ""));
                continue;
            }

            enchantmentInventory.addItem(createGUIItem(Material.ENCHANTING_TABLE, "", ""));
        }
    }

    protected ItemStack createGUIItem (Material material, String itemName, String itemLore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(itemName);
        meta.setLore(Arrays.asList(itemLore));

        item.setItemMeta(meta);
        return item;
    }

    public void openInventory(final HumanEntity human) {
        human.openInventory(enchantmentInventory);
    }

    @EventHandler
    public void onInventoryClick (InventoryClickEvent e) {
        // TODO Add Handler
    }

    @EventHandler
    public void onInventoryClick (InventoryDragEvent e) {
        if (e.getInventory().equals(enchantmentInventory)) e.setCancelled(true);
    }
}
