package io.github.igomq.carrotory.Listener;

import io.github.igomq.carrotory.Utility.Reinforce;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Map;
import java.util.Random;

public class PlayerInventoryClickListener implements Listener {
    @EventHandler
    @SuppressWarnings("deprecation")
    public void onInventoryClick (InventoryClickEvent e) {
        if (!e.getView().getTitle().equals("Enchant") && !e.getView().getTitle().equals("Reinforce")) return;
        Inventory inv = e.getInventory();
        e.setCancelled(true);

        String invTitle = e.getView().getTitle();

        if(invTitle.equalsIgnoreCase("Enchant")) {
            final ItemStack clickedItem = e.getCurrentItem();
            if (clickedItem == null || clickedItem.getType().isAir() || clickedItem.getType().equals(Material.ENCHANTING_TABLE)) return;
            if (clickedItem.getType().equals(Material.RED_STAINED_GLASS_PANE)) { e.getWhoClicked().closeInventory(); }

            Random rand = new Random();
            int enchantmentCount = rand.nextInt(5) + 1;

            Player user = (Player) e.getWhoClicked();
            user.playSound(user.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 2.0F, 1.0F);

            // TODO Add scroll system
            ItemMeta itemMeta = clickedItem.getItemMeta();
            Map<Enchantment, Integer> x = itemMeta.getEnchants();
            for (Map.Entry<Enchantment, Integer> m : x.entrySet()) {
                Enchantment em = m.getKey();

                itemMeta.removeEnchant(em);
            }
            for (int i=0; i<enchantmentCount; i++) {
                itemMeta.addEnchant(Enchantment.values()[(int) (Math.random()*Enchantment.values().length)], rand.nextInt(5) + 1, true);
            }

            clickedItem.setItemMeta(itemMeta);
            e.setCurrentItem(clickedItem);
        } else if (invTitle.equalsIgnoreCase("Reinforce")) {
            final ItemStack clickedItem = e.getCurrentItem();
            if (clickedItem == null || clickedItem.getType().isAir() || clickedItem.getType().equals(Material.ANVIL)) return;
            if (clickedItem.getType().equals(Material.RED_STAINED_GLASS_PANE)) { e.getWhoClicked().closeInventory(); return; }

            Reinforce sys = new Reinforce();
            ItemStack reinforcedItem = sys.reinforce(clickedItem, (Player)e.getWhoClicked());

            if(reinforcedItem.equals(clickedItem)) return;
            e.setCurrentItem(reinforcedItem);
        }
    }

    @EventHandler
    @SuppressWarnings("deprecation")
    public void onInventoryClick (InventoryDragEvent e) {
        if (e.getView().getTitle().equals("Enchant") || e.getView().getTitle().equals("Reinforce")) e.setCancelled(true);
    }
}
