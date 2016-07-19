package com.test.mod.blocks;

import com.test.mod.Reference;
import com.test.mod.Reference.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;

public class BlockTest extends BaseBlock{
	
	public BlockTest()
    {
        super(Material.ROCK);
        this.setHardness(1.75F);
        this.setResistance(5F);
        this.setSoundType(blockSoundType.STONE);
        this.setHarvestLevel("pickaxe", 0);
        this.setUnlocalizedName(Reference.Blocks.test);
        this.setRegistryName(Reference.MODID, this.getUnlocalizedName().substring(5));
    }

}
