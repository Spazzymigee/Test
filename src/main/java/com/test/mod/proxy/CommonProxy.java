package com.test.mod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//run only on server
public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {}

    public void init(FMLInitializationEvent e) {}

    public void postInit(FMLPostInitializationEvent e) {}
}