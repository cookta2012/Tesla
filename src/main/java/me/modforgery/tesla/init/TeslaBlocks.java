package me.modforgery.tesla.init;

import me.modforgery.tesla.block.BlockDecorative;
import me.modforgery.tesla.block.BlockPlasmaFurnace;
import me.modforgery.tesla.block.BlockTeslaCoil;
import me.modforgery.tesla.block.BlockVDGGenerator;
import me.modforgery.tesla.block.te.TileEntityTeslaCoil;
import me.modforgery.tesla.block.te.TileEntityVDGGenerator;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */
public class TeslaBlocks
{
	
	public static Block vdgGenerator;
	public static Block teslaCoil;
	public static Block plasmaFurnace;
	public static Block metalPlate;
	
    public static void init()
    {
    	vdgGenerator = new BlockVDGGenerator();
    	teslaCoil = new BlockTeslaCoil();
        plasmaFurnace = new BlockPlasmaFurnace();
        metalPlate = new BlockDecorative("metalPlate");

    	GameRegistry.registerBlock(vdgGenerator, "vdgGenerator");
    	GameRegistry.registerBlock(teslaCoil, "teslaCoil");
        GameRegistry.registerBlock(plasmaFurnace, "plasmaFurnace");
        GameRegistry.registerBlock(metalPlate, "metalPlate");

    	GameRegistry.registerTileEntity(TileEntityVDGGenerator.class, "te_vdgGenerator");
    	GameRegistry.registerTileEntity(TileEntityTeslaCoil.class, "te_teslaCoil");

    }
}
