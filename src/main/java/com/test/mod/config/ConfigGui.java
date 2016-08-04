package com.test.mod.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.test.mod.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class ConfigGui extends GuiConfig {
	
	public ConfigGui(GuiScreen parentScreen) {
		super(parentScreen, getConfigElements(), Reference.MODID, false, false, I18n.format(Reference.MODID + ".config.title"));
	}

	//Requires Java 8 or Higher!!!
	private static List<IConfigElement> getConfigElements() {
		return Config.config.getCategoryNames().stream()
				.map(categoryName -> new ConfigElement(Config.config.getCategory(categoryName).setLanguageKey(Reference.MODID + ".config." + categoryName)))
				.collect(Collectors.toList());
	}
 
}