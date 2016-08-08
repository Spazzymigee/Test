package com.test.mod;

import com.test.mod.blocks.BaseBlock;
import com.test.mod.blocks.BlockTest;
import com.test.mod.items.BaseItem;
import com.test.mod.items.ItemTest;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@GameRegistry.ObjectHolder(Reference.MODID)
public class WorldRegistry {
	
	//creating the block and ItemBlock
	public final static BaseBlock testBlock = new BlockTest();
	public final static ItemBlock testItemBlock = (ItemBlock) new ItemBlock(testBlock).setRegistryName(testBlock.getRegistryName());

	//creating the item
	public static final BaseItem testItem = new ItemTest();

	public static void RegisterBlocks()
    {
		//registering the blocks, don't forget to register the ItemBlock as well!
		 GameRegistry.register(testBlock);
		 GameRegistry.register(testItemBlock);

		//It won't add to creative tab without this line for some reason
		 testBlock.setCreativeTab(WorldRegistry.tabTest);
    }
	
	public static void RegisterItems()
    {
		//registering the item
		GameRegistry.register(testItem);
		
		
		//It won't add to creative tab without this line for some reason
		testItem.setCreativeTab(WorldRegistry.tabTest);
    }
	
	//creates the creative tab
	public static CreativeTabs tabTest = new CreativeTabs("tabTest") {
		    @Override
		    @SideOnly(Side.CLIENT)
		    
		    //sets the icon for the tab
		    public Item getTabIconItem() {
		        return Items.COAL;
		    }
	};
	
	
	
}
