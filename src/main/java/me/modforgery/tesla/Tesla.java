package me.modforgery.tesla;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import me.modforgery.tesla.init.TeslaBlocks;
import me.modforgery.tesla.init.TeslaItems;
import me.modforgery.tesla.init.TeslaRecipes;
import me.modforgery.tesla.proxy.IProxy;
import me.modforgery.tesla.reference.Reference;

/**
 * File by ModForgery for Tesla on 31/08/2014.
 */

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version)
public class Tesla
{
    @SidedProxy(clientSide = Reference.client_proxy, serverSide = Reference.common_proxy)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        TeslaBlocks.init();
        TeslaItems.init();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
        TeslaRecipes.init();
    }
}
