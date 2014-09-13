package me.modforgery.tesla;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import me.modforgery.tesla.crossmod.TeslaCrossMod;
import me.modforgery.tesla.gui.Handler;
import me.modforgery.tesla.init.TeslaBlocks;
import me.modforgery.tesla.init.TeslaItems;
import me.modforgery.tesla.init.TeslaOreDictionary;
import me.modforgery.tesla.init.TeslaPackets;
import me.modforgery.tesla.init.TeslaRecipes;
import me.modforgery.tesla.proxy.IProxy;
import me.modforgery.tesla.reference.Reference;
import me.modforgery.tesla.worldgen.WorldGenerator;

/**
 * File by ModForgery for Tesla on 31/08/2014.
 */

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version)
public class Tesla
{
    @SidedProxy(clientSide = Reference.client_proxy, serverSide = Reference.common_proxy)
    public static IProxy proxy;

    @Mod.Instance(Reference.modid)
    private static Tesla instance;

    public static SimpleNetworkWrapper wrapper;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
    	proxy.initRenderers();
    	TeslaCrossMod.preInit();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        TeslaBlocks.init();
        TeslaItems.init();

        TeslaPackets.init();

        NetworkRegistry.INSTANCE.registerGuiHandler(instance(), new Handler());
        GameRegistry.registerWorldGenerator(new WorldGenerator(), 1);
        
        TeslaCrossMod.init();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
    	TeslaOreDictionary.init();
        TeslaRecipes.init();
        TeslaCrossMod.postInit();
    }

    public static Tesla instance()
    {
        return instance;
    }
}
