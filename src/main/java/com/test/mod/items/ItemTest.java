package com.test.mod.items;

import com.test.mod.Main;
import com.test.mod.Reference;

public class ItemTest extends BaseItem {
   
	public ItemTest()
    {
        super();
        this.setUnlocalizedName(Reference.Items.test);
        this.setRegistryName(Reference.MODID, this.getUnlocalizedName().substring(5));
    } 
}
