package me.modforgery.tesla.block;

import me.modforgery.tesla.block.te.TileEntityVDGGenerator;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockVDGGenerator extends BlockContainer {

	public BlockVDGGenerator() {
		super(Material.iron);
		setBlockName("vdgGenerator");
		setCreativeTab(CreativeTabs.tabRedstone);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityVDGGenerator();
	}
}
