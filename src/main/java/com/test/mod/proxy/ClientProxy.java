package com.test.mod.proxy;

import com.test.mod.WorldRegistry;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//run only on client
public class ClientProxy extends CommonProxy{
		
	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e); 
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        
        RegisterBlockTextures(WorldRegistry.testBlock, 0);
        
        RegisterItemTextures(WorldRegistry.testItem, 0);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
    
    
	public static void RegisterBlockTextures(Block block, int meta){
		Item item = Item.getItemFromBlock(block);		
		ModelLoader.registerItemVariants(item, new ModelResourceLocation(item.getRegistryName(),"inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(item.getRegistryName(),"inventory"));	
		
	}	
	
	public static void RegisterItemTextures(Item item, int meta){		
		ModelLoader.registerItemVariants(item, new ModelResourceLocation(item.getRegistryName(),"inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(item.getRegistryName(),"inventory"));	
		
	}
	
}
