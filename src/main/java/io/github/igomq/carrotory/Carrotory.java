package io.github.igomq.carrotory;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.io.InputStream;

import static io.github.igomq.carrotory.Utility.GetProperties.getProperty;

public class Carrotory extends JavaPlugin {
    public static InputStream me = Carrotory.class.getClassLoader().getResourceAsStream("info.properties");

    protected String version;

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
        Bukkit.broadcastMessage(ChatColor.GREEN + "Carrotory Plugin Version " + version);
        Bukkit.broadcastMessage(ChatColor.GREEN + "Developer GomQ, Github https://github.com/igomq");
    }

    @Override
    public void onDisable() {
        Bukkit.broadcastMessage(ChatColor.RED + "Disabling Carrotory Plugin ["+version+"]");
    }

    public void initializePlugin() throws IOException {
        version = getProperty("version");
    }
}
