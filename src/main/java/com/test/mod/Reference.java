package com.test.mod;

public class Reference {

	//sets names so you don't have to write it out a million times!
		//!Never change your modid between versions!
	public static final String MODID = "test_mod";
	public static final String VERSION = "1.0";
	public static final String NAME = "Test Mod";
	public static final String AUTHOR = "Alex Koehn";
	
	//this points to certain class files
    public static final String CLIENT_PROXY_CLASS = "com.test.mod.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.test.mod.proxy.CommonProxy";
    public static final String GUI_FACTORY_CLASS = "com.test.mod.config.GuiFactory";
	
    //names used for unlocalized name
    public static final class Blocks
    {
        public static final String test = "testBlock";  
    }
    
    //names used for unlocalized name
    public static final class Items
    {
        public static final String test = "testItem";  
    }
}

