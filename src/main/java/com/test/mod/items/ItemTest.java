package com.test.mod.items;

import com.test.mod.Main;
import com.test.mod.Reference;

public class ItemTest extends BaseItem {
   
	public ItemTest()
    {
        super();
        //sets name used for registry later on
        this.setUnlocalizedName(Reference.Items.test);
        
       //registers texture and registry name from unlocalized name
        this.setRegistryName(Reference.MODID, this.getUnlocalizedName().substring(5));
        
        //sets the maximum is can stack (can't exceed 64)
        this.setMaxStackSize(16);
    } 
}
