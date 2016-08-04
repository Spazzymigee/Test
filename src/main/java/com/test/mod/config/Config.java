package com.test.mod.config;

import java.io.File;

import com.test.mod.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Config {
 
    public static Config instance = new Config();
    public static Configuration config;

    public static boolean testBoolean = true;
    public static int testInteger = 1;
 
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
        if (eventArgs.getModID().equals(Reference.MODID))
            Config.syncConfig();
    }
 
    public static void init(File file) {
        config = new Configuration(file);
        config.load();
        syncConfig();
    }
 
    public static void syncConfig() {
        String worldCategory = "World Generaration";
 
        config.addCustomCategoryComment(worldCategory, "World Generaration Settings");
        
        testBoolean = config.getBoolean("Test Boolean", worldCategory, true, "Test Boolean Description");
        testInteger = config.getInt("Test Int", worldCategory, 1, 0, 1, "Test Integer Description");

        config.save();
    }
 
    public static void resetConfig() {
    	testBoolean = true;
    	
    	testInteger = 1;

        config.save();
    }
}
 