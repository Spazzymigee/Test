package com.test.mod.proxy;

import com.test.mod.Reference;
import com.test.mod.config.Config;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//run only on server
public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		
		//i have no idea what this does?? Listens for changes in config maybe...
		MinecraftForge.EVENT_BUS.register(Config.instance);
		//creates new config file
		Config.init(e.getSuggestedConfigurationFile());
		//looks at config and updates variables (I think)
	    Config.syncConfig();
	}

    public void init(FMLInitializationEvent e) {}

    public void postInit(FMLPostInitializationEvent e) {}
}