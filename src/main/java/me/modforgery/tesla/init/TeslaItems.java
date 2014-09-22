package me.modforgery.tesla.init;

import cpw.mods.fml.common.registry.GameRegistry;
import me.modforgery.tesla.item.*;
import net.minecraft.item.Item;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */
public class TeslaItems
{
    public static Item tp_device;
    public static Item t_voltmeter;
    public static Item conductor;
    public static Item coil;
    public static Item copper_ingot;
    public static Item tin_ingot;

    public static void init()
    {
        tp_device = new TPDevice();
        t_voltmeter = new TVoltmeter();
        conductor = new Conductor();
        coil = new Coil();
        copper_ingot = new CopperIngot();
        tin_ingot = new TinIngot();

        GameRegistry.registerItem(tp_device, "TPDevice");
        GameRegistry.registerItem(t_voltmeter, "TVoltmeter");
        GameRegistry.registerItem(conductor, "Conductor");
        GameRegistry.registerItem(coil, "coil");
        GameRegistry.registerItem(copper_ingot, "copper_ingot");
        GameRegistry.registerItem(tin_ingot, "tin_ingot");
    }

}
