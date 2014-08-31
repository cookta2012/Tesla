package me.modforgery.tesla.block;

import me.modforgery.tesla.CreativeTabTesla;
import me.modforgery.tesla.block.te.TileEntityTeslaCoil;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTeslaCoil extends BlockContainer {

	public BlockTeslaCoil() {
		super(Material.iron);
		setBlockName("teslaCoil");
		setCreativeTab(CreativeTabTesla.TS_TAB);
		setBlockBounds(0.125f, 0, 0.125f, 0.875f, 1, 0.875f);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityTeslaCoil();
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public int getRenderType() {
		return 110;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
}
