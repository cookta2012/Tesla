package me.modforgery.tesla.item;

import me.modforgery.tesla.CreativeTabTesla;
import net.minecraft.item.Item;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */
public class Conductor extends Item
{
    public Conductor()
    {
        super();
        setCreativeTab(CreativeTabTesla.TS_TAB);
        setUnlocalizedName("conductor");
        setTextureName("tesla:conductor");
    }
}
