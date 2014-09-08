package me.modforgery.tesla.block;/**
 * /**
 * File by ModForgery for Tesla on 31/08/2014
 */

import me.modforgery.tesla.CreativeTabTesla;
import me.modforgery.tesla.block.te.TileEntityPlasmaFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


public class BlockPlasmaFurnace extends BlockContainer{

    public BlockPlasmaFurnace() {
        super(Material.iron);
        setCreativeTab(CreativeTabTesla.TS_TAB);
        setBlockName("plasmaFurnace");
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityPlasmaFurnace();
    }
}
