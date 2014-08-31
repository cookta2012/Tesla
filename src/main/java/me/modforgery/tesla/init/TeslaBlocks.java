package me.modforgery.tesla.init;

import cpw.mods.fml.common.registry.GameRegistry;
import me.modforgery.tesla.block.BlockTeslaCoil;
import me.modforgery.tesla.block.BlockVDGGenerator;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */
public class TeslaBlocks
{
	
	public static Block vdgGenerator;
	public static Block teslaCoil;
	
    public static void init()
    {
    	vdgGenerator = new BlockVDGGenerator().setBlockName("vdgGenerator").setCreativeTab(CreativeTabs.tabRedstone);
    	teslaCoil = new BlockTeslaCoil().setBlockName("teslaCoil").setCreativeTab(CreativeTabs.tabRedstone);
    	
    	GameRegistry.registerBlock(vdgGenerator, "vdgGenerator");
    	GameRegistry.registerBlock(teslaCoil, "teslaCoil");
    }
}
