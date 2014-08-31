package me.modforgery.tesla.block;

import me.modforgery.tesla.CreativeTabTesla;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDecorative extends Block {
	
	public BlockDecorative(String name) {
		super(Material.iron);
		setBlockName(name);
		setCreativeTab(CreativeTabTesla.TS_TAB);
		setBlockTextureName("tesla:" + name);
	}

}
