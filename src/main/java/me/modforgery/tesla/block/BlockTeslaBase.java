package me.modforgery.tesla.block;

import me.modforgery.tesla.CreativeTabTesla;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * File by ModForgery for Minecraft on 01/09/2014.
 */
public class BlockTeslaBase extends Block implements ITileEntityProvider
{
    public BlockTeslaBase()
    {
        super(Material.iron);
        setBlockName("teslaBase");
        setCreativeTab(CreativeTabTesla.TS_TAB);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return null;
    }
}
