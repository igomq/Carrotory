package io.github.igomq.carrotory.Utility;

import java.io.*;
import java.util.Properties;

import static io.github.igomq.carrotory.Carrotory.carrotory;

public class DataFile {
    private static File configFile = new File(carrotory.getDataFolder(), "config.properties");

    public static String[][] args = {
            {"announceReinforceFail","false"},
            {"logReinforce","false"},
            {"allowChangeChance","false"},
            {"useScroll","true"},
    };

    public static boolean isConfigAlreadySetUp() {
        return configFile.exists();
    }

    @SuppressWarnings("deprecated")
    public static void setupConfigFile() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(configFile.getPath()));

        for (String[] x : args) {
            String key = null;
            String value = null;

            for (int i=0; i<x.length; i++) {
                if (i%2==0) key = x[i];
                else value = x[i];
            }

            props.setProperty(key, value);
        }
        props.save(new FileOutputStream(configFile.getPath()),"Plugin Configuration Setup");
    }

    public static boolean[] loadConfig() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(configFile.getPath()));

        boolean[] array = new boolean[args.length];
        for (String[] x : args) {
            for(int i=0; i<x.length; i++)
                if (i%2==1) array[i]= Boolean.parseBoolean(x[i]);
        }

        return array;
    }
}
