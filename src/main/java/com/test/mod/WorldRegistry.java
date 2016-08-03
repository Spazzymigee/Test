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
	
	public final static BaseBlock testBlock = new BlockTest();
	public final static ItemBlock testItemBlock = (ItemBlock) new ItemBlock(testBlock).setRegistryName(testBlock.getRegistryName());

	public static final BaseItem testItem = new ItemTest();

	public static void RegisterBlocks()
    {
		 GameRegistry.register(testBlock);
		 GameRegistry.register(testItemBlock);

		 testBlock.setCreativeTab(WorldRegistry.tabTest);
    }
	
	public static void RegisterItems()
    {
		GameRegistry.register(testItem);
		
		testItem.setCreativeTab(WorldRegistry.tabTest);
    }
		
	public static CreativeTabs tabTest = new CreativeTabs("tabTest") {
		    @Override
		    @SideOnly(Side.CLIENT)
		    public Item getTabIconItem() {
		        return Items.COAL;
		    }
	};
	
	
	
}
