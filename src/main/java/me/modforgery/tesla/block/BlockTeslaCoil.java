package me.modforgery.tesla.block;

import me.modforgery.tesla.block.te.TileEntityTeslaCoil;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTeslaCoil extends BlockContainer {

	public BlockTeslaCoil() {
		super(Material.iron);
		setBlockName("teslaCoil");
		setCreativeTab(CreativeTabs.tabRedstone);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityTeslaCoil();
	}

}
