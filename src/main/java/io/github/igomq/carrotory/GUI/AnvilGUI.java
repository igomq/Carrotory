package io.github.igomq.carrotory.GUI;

import io.github.igomq.carrotory.Utility.Reinforce;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Collections;

public class AnvilGUI implements Listener {
    public final Inventory anvilInventory;

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

                anvilInventory.addItem(createGUIItem(material, itemName, ""));
                continue;
            }

            anvilInventory.addItem(createGUIItem(Material.ANVIL, "", ""));
        }
    }

    protected ItemStack createGUIItem (Material material, String itemName, String itemLore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        assert meta != null;
        meta.setDisplayName(itemName);
        meta.setLore(Collections.singletonList(itemLore));

        item.setItemMeta(meta);
        return item;
    }

    public void openInventory(final HumanEntity human) {
        human.openInventory(anvilInventory);
    }

    @EventHandler
    public void onInventoryClick (InventoryClickEvent e) {
        if (e.getInventory() != anvilInventory) return;
        e.setCancelled(true);

        final ItemStack clickedItem = e.getCurrentItem();
        if (clickedItem == null || clickedItem.getType().isAir()) return;

        ItemStack equipment = anvilInventory.getItem(4);
        Reinforce sys = new Reinforce();
        ItemStack reinforcedItem = sys.reinforce(equipment, (Player)e.getWhoClicked());

        e.setCurrentItem(reinforcedItem);
    }

    @EventHandler
    public void onInventoryClick (InventoryDragEvent e) {
        if (e.getInventory().equals(anvilInventory)) e.setCancelled(true);
    }
}
