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
		
		MinecraftForge.EVENT_BUS.register(Config.instance);
		Config.init(e.getSuggestedConfigurationFile());
	    Config.syncConfig();
	}

    public void init(FMLInitializationEvent e) {}

    public void postInit(FMLPostInitializationEvent e) {}
}