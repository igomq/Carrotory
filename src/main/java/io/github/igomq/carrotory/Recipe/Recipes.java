package io.github.igomq.carrotory.Recipe;

import org.bukkit.inventory.ShapedRecipe;

import java.util.ArrayList;
import java.util.Arrays;

public class Recipes {
    public static ShapedRecipe[] getRecipes() {
        ShapedRecipe[] recipes = new ShapedRecipe[8];

        recipes[0] = BasicScroll.getScroll();
        recipes[1] = AdvancedScroll.getScroll();
        recipes[2] = AncientScroll.getScroll();
        recipes[3] = PowerfulScroll.getScroll();

        recipes[4] = BasicReinforceScroll.getScroll();
        recipes[5] = BasicMultiScroll.getScroll();
        recipes[6] = AdvancedMultiScroll.getScroll();
        recipes[7] = StrongestMultiScroll.getScroll();

        return recipes;
    }
}
