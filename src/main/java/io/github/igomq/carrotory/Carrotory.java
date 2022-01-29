package io.github.igomq.carrotory;

import io.github.igomq.carrotory.GUI.AnvilGUI;
import io.github.igomq.carrotory.GUI.EnchantmentGUI;
import io.github.igomq.carrotory.Listener.PlayerInteractionListener;
import io.github.igomq.carrotory.Utility.DataFile;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

import static io.github.igomq.carrotory.Utility.DataFile.isConfigAlreadySetUp;

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
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.broadcastMessage(ChatColor.GRAY + "Loading plugin");
        Bukkit.broadcastMessage(ChatColor.GRAY + 
                "   ___                  _                \n" +
                "  / __|__ _ _ _ _ _ ___| |_ ___ _ _ _  _ \n" +
                " | (__/ _` | '_| '_/ _ \\  _/ _ \\ '_| || |\n" +
                "  \\___\\__,_|_| |_| \\___/\\__\\___/_|  \\_, |\n" +
                "                                    |__/ ");
        Bukkit.broadcastMessage(ChatColor.GREEN + "Carrotory Plugin");
        Bukkit.broadcastMessage(ChatColor.GREEN + "Developer GomQ, Github https://github.com/igomq");
    }

    @Override
    public void onDisable() {
        Bukkit.broadcastMessage(ChatColor.RED + "Disabling Carrotory Plugin");
    }

    public void initializePlugin() throws IOException {
        if (!isConfigAlreadySetUp()) DataFile.setupConfigFile();
        pluginConfig = DataFile.loadConfig();

        Bukkit.getPluginManager().registerEvents(new PlayerInteractionListener(), this);
        Bukkit.getPluginManager().registerEvents(new AnvilGUI(), this);
        Bukkit.getPluginManager().registerEvents(new EnchantmentGUI(), this);
    }
}