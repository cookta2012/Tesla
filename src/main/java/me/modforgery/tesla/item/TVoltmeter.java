package me.modforgery.tesla.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */
public class TVoltmeter extends Item
{
    public TVoltmeter()
    {
        super();
        setCreativeTab(CreativeTabs.tabRedstone);
        setUnlocalizedName("tVoltmeter");
        setTextureName("tesla:tvoltmeter");
        setMaxStackSize(1);
    }
}
