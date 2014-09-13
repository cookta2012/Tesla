package me.modforgery.tesla.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */
public class TeslaRecipes
{
    public static void init()
    {
    	GameRegistry.addSmelting(TeslaBlocks.oreCopper, new ItemStack(TeslaItems.copper_ingot), 0.6F);
    }
}
