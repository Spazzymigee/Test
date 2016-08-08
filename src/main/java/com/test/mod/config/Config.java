package com.test.mod.config;

import java.io.File;

import com.test.mod.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Config {
 
    public static Config instance = new Config();
    public static Configuration config;

    //actual usable variables
    public static boolean testBoolean = true;
    public static int testInteger = 1;
 
    //Listens to see if the config file is different from here and if it belongs to the same mod, if so update the variables
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
        if (eventArgs.getModID().equals(Reference.MODID))
            Config.syncConfig();
    }
 
    //create the variables, load from file, and sync
    public static void init(File file) {
        config = new Configuration(file);
        config.load();
        Config.syncConfig();
    }
 
    //Declares the actual file contents
    public static void syncConfig() {
    	
    	//creates an new menu
        String worldCategory = "World Generaration";
 
        //adds a title to the category
        config.addCustomCategoryComment(worldCategory, "World Generaration Settings");
        
        //creates entries and adds them to the category
        // (bool) name, category, default state, tool tip
        // (int)  name, category, default value, min value, max valve, tool tip
        testBoolean = config.getBoolean("Test Boolean", worldCategory, true, "Test Boolean Description");
        testInteger = config.getInt("Test Int", worldCategory, 1, 0, 1, "Test Integer Description");
        
        //save to the file
        config.save();
    }
 
    //called when the reset button is pressed, and saves the file
    public static void resetConfig() {
    	testBoolean = true;
    	testInteger = 1;
    	
        //save to the file
        config.save();
    }
}
 