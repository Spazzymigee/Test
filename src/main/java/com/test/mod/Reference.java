package com.test.mod;

public class Reference {

	public static final String MODID = "test_mod";
	public static final String VERSION = "1.0";
	public static final String NAME = "Test Mod";
	public static final String AUTHOR = "Alex Koehn";
	
    public static final String CLIENT_PROXY_CLASS = "com.test.mod.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.test.mod.proxy.CommonProxy";
	
    public static final class Blocks
    {
        public static final String test = "testBlock";  
    }
    
    public static final class Items
    {
        public static final String test = "testItem";  
    }
}

