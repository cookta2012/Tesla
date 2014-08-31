package me.modforgery.tesla.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTeslaCoil extends Block {

	public BlockTeslaCoil() {
		super(Material.iron);
		setBlockName("teslaCoil");
		setCreativeTab(CreativeTabs.tabRedstone);
	}

}
