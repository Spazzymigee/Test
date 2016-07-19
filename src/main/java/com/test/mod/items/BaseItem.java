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
        this.setCreativeTab(WorldRegistry.tabTest);
    }   
}