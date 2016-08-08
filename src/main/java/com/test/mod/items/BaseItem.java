package com.test.mod.items;

import com.test.mod.Main;
import com.test.mod.WorldRegistry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BaseItem extends Item
{
    public BaseItem()
    {
        super();
        //I don't know why this doesn't work but it should...
        this.setCreativeTab(WorldRegistry.tabTest);
    }   
}