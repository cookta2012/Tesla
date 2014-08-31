package me.modforgery.tesla.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockVDGGenerator extends Block {

	public BlockVDGGenerator() {
		super(Material.iron);
		setBlockName("vdgGenerator");
		setCreativeTab(CreativeTabs.tabRedstone);
	}

}
