package me.modforgery.tesla.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */
public class TPDevice extends Item
{
    public TPDevice()
    {
        super();
        setCreativeTab(CreativeTabs.tabRedstone);
        setUnlocalizedName("tpDevice");
        setTextureName("tesla:tpdevice");
        setMaxStackSize(1);
        setFull3D();
    }
}
