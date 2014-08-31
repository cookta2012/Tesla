package me.modforgery.tesla.block;/**
 * /**
 * File by ModForgery for Tesla on 31/08/2014
 */

import me.modforgery.tesla.CreativeTabTesla;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;



public class BlockPlasmaFurnace extends Block{

    public BlockPlasmaFurnace() {
        super(Material.iron);
        setCreativeTab(CreativeTabTesla.TS_TAB);
        setBlockName("plasmaFurnace");
    }
}
