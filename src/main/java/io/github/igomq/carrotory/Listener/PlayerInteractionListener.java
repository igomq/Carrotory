package io.github.igomq.carrotory.Listener;

import io.github.igomq.carrotory.Carrotory;
import io.github.igomq.carrotory.GUI.AnvilGUI;
import io.github.igomq.carrotory.GUI.EnchantmentGUI;
import org.apache.commons.lang.ArrayUtils;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractionListener implements Listener {
    private final Material[] materials = { Material.ENCHANTING_TABLE, Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL };

    @EventHandler
    public void onPlayerInteraction(PlayerInteractEvent e) {
        Block clickedBlock = e.getClickedBlock();

        if (clickedBlock==null) return;
        if (clickedBlock.getType().equals(Material.CRAFTING_TABLE) || clickedBlock.getType().equals(Material.FURNACE)) return;
        if (clickedBlock.getType().isAir()) return;

        if (!ArrayUtils.contains(materials, clickedBlock.getType())) return;

        e.setCancelled(true);

        HumanEntity h = e.getPlayer();
        assert clickedBlock != null;
        if (clickedBlock.getType().equals(Material.ENCHANTING_TABLE)) {
            EnchantmentGUI enchant = new EnchantmentGUI();
            enchant.openInventory(h);
        } else {
            AnvilGUI anvil = new AnvilGUI();
            anvil.openInventory(h);
        }
    }
}
