package io.github.igomq.carrotory.Recipe;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

import static io.github.igomq.carrotory.Info.Scrolls.*;

public class BasicMultiScroll {
    public static ShapedRecipe getScroll() {
        ItemStack scroll = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta meta = scroll.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY,10,true);
        meta.setDisplayName(itemNames[5]);
        meta.setLore(Collections.singletonList(Lores[5]));
        scroll.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("bas_m"), scroll);
        recipe.shape(
                "   ",
                " PP",
                " PI");
        recipe.setIngredient('P', Material.PAPER);
        recipe.setIngredient('I', Material.GOLD_BLOCK);

        return recipe;
    }
}
