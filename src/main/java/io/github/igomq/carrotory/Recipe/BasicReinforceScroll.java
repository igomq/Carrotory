package io.github.igomq.carrotory.Recipe;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

import static io.github.igomq.carrotory.Info.Scrolls.*;

public class BasicReinforceScroll {
    public static ItemStack itemScroll;

    public static ShapedRecipe getScroll() {
        ItemStack scroll = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta meta = scroll.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY,10,true);
        meta.setDisplayName(itemNames[4]);
        meta.setLore(Collections.singletonList(Lores[4]));
        scroll.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("bas_r"), scroll);
        recipe.shape(
                "   ",
                " PP",
                " PI");
        recipe.setIngredient('P', Material.PAPER);
        recipe.setIngredient('I', Material.LAPIS_LAZULI);

        itemScroll = scroll;
        return recipe;
    }
}
