package com.test.mod;

import com.test.mod.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MODID, name=Reference.NAME, version = Reference.VERSION,  guiFactory = Reference.GUI_FACTORY_CLASS)
public class Main
{
	//declares mod stuff, used sometimes
	@Instance(value = Reference.MODID)
    public static Main instance = new Main();
	
	//declares proxy information
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	//run before mods are loaded
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);   
    }

    //run during mods are loaded, run most of your code here
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	
    	//calling to register the blocks and items
        WorldRegistry.RegisterBlocks();
        WorldRegistry.RegisterItems();
        
        proxy.init(e);
    }

    //run after all mods 'init' method are run, very useful for cross mod interaction
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e); 
    }
    
}
