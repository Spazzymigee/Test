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
		//sets material
        super(Material.ROCK);
        
        //how long it takes to mine
        this.setHardness(1.75F);
        
        //Resistance to explosives
        this.setResistance(5F);
        
        //sound it makes when broken or stepped on (will use material if not present)
        this.setSoundType(blockSoundType.STONE);
        
        //sets what tool to use and at what level
        this.setHarvestLevel("pickaxe", 0);
        
        //sets name used for registry
        this.setUnlocalizedName(Reference.Blocks.test);
        
        //registers texture and registry name from unlocalized name
        this.setRegistryName(Reference.MODID, this.getUnlocalizedName().substring(5));
    }

}
