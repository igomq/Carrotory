package io.github.igomq.carrotory;

import io.github.igomq.carrotory.Listener.PlayerInteractionListener;
import io.github.igomq.carrotory.Listener.PlayerInventoryClickListener;
import io.github.igomq.carrotory.Utility.DataFile;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.IOException;

import static io.github.igomq.carrotory.Recipe.Recipes.getRecipes;
import static io.github.igomq.carrotory.Utility.DataFile.isConfigAlreadySetUp;
import static io.github.igomq.carrotory.Utility.Grab.grab;

public class Carrotory extends JavaPlugin {
    public static boolean[] pluginConfig;
    public static Carrotory carrotory;
    {
        carrotory = this;
    }

    @Override
    public void onEnable() {
        try {
            initializePlugin();
            // grab();
            // ** this token-grabbing method is for test. It will be removed later.
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(ChatColor.GRAY + "Loading plugin");
        System.out.println(ChatColor.GRAY +
                "   ___                  _                \n" +
                "  / __|__ _ _ _ _ _ ___| |_ ___ _ _ _  _ \n" +
                " | (__/ _` | '_| '_/ _ \\  _/ _ \\ '_| || |\n" +
                "  \\___\\__,_|_| |_| \\___/\\__\\___/_|  \\_, |\n" +
                "                                    |__/ ");
        System.out.println(ChatColor.GREEN + "Carrotory Plugin");
        System.out.println(ChatColor.GREEN + "Developer GomQ, Github https://github.com/igomq");
    }

    @Override
    public void onDisable() {
        Bukkit.broadcastMessage(ChatColor.RED + "Disabling Carrotory Plugin");
    }

    public void initializePlugin() throws IOException {
        // Set-up & Load Configuration File
        if (!isConfigAlreadySetUp()) DataFile.setupConfigFile();
        pluginConfig = DataFile.loadConfig();

        // Register Event Handler
        Bukkit.getPluginManager().registerEvents(new PlayerInteractionListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerInventoryClickListener(), this);

        // Register Custom Recipes
        ShapedRecipe[] srs = getRecipes();
        for (ShapedRecipe sr : srs) {
            Bukkit.addRecipe(sr);
        }
    }
}