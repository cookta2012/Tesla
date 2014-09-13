package me.modforgery.tesla.block;

import me.modforgery.tesla.CreativeTabTesla;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */
public class BlockCopperOre extends Block {

    public BlockCopperOre() {
        super(Material.rock);
        setBlockName("oreCopper");
        setBlockTextureName("tesla:copper_ore");
        setCreativeTab(CreativeTabTesla.TS_TAB);
        setHardness(3.0F);
        setResistance(5.0F);
        setStepSound(soundTypePiston);
    }
}
