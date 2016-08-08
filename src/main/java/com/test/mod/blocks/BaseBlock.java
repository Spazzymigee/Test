package com.test.mod.blocks;

import com.test.mod.Main;
import com.test.mod.Reference;
import com.test.mod.WorldRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BaseBlock extends Block
{
    public BaseBlock(Material material)
    {
        super(material);
        //I don't know why this doesn't work but it should...
        this.setCreativeTab(WorldRegistry.tabTest);
    }
}