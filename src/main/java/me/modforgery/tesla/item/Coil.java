package me.modforgery.tesla.item;

import me.modforgery.tesla.CreativeTabTesla;
import net.minecraft.item.Item;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */

public class Coil extends Item
{
    public Coil()
    {
        super();
        setCreativeTab(CreativeTabTesla.TS_TAB);
        setUnlocalizedName("coil");
        setTextureName("tesla:coil");
    }
}
