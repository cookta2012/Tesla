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

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World world, int x, int y, int z)
    {
        super.onBlockAdded(world, x, y, z);
    }

    public void breakBlock(World world, int x, int y, int z, Block block, int meta)
    {
        super.breakBlock(world, x, y, z, block, meta);
        world.removeTileEntity(x, y, z);
    }

    public boolean onBlockEventReceived(World world, int x, int y, int z, int p_149696_5_, int p_149696_6_)
    {
        super.onBlockEventReceived(world, x, y, z, p_149696_5_, p_149696_6_);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        return tileentity != null ? tileentity.receiveClientEvent(p_149696_5_, p_149696_6_) : false;
    }
}
