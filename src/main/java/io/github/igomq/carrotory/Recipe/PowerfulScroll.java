package io.github.igomq.carrotory.Recipe;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

import static io.github.igomq.carrotory.Info.Scrolls.*;

public class PowerfulScroll {
    public static ItemStack itemScroll;

    public static ShapedRecipe getScroll() {
        ItemStack scroll = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta meta = scroll.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY,10,true);
        meta.setDisplayName(itemNames[3]);
        meta.setLore(Collections.singletonList(Lores[3]));
        scroll.setItemMeta(meta);

        ItemStack ancientScroll = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta meta2 = scroll.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY,10,true);
        meta.setDisplayName(itemNames[2]);
        meta.setLore(Collections.singletonList(Lores[2]));
        scroll.setItemMeta(meta2);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("pow"), scroll);
        recipe.shape(
                "S  ",
                " PP",
                " PI");
        recipe.setIngredient('S', Material.NETHERITE_INGOT);
        recipe.setIngredient('P', Material.PAPER);
        recipe.setIngredient('I', ancientScroll);

        itemScroll = scroll;
        return recipe;
    }
}
