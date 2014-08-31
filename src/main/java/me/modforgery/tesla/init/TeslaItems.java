package me.modforgery.tesla.init;

import cpw.mods.fml.common.registry.GameRegistry;
import me.modforgery.tesla.item.TPDevice;
import me.modforgery.tesla.item.TVoltmeter;
import net.minecraft.item.Item;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */
public class TeslaItems
{
    public static Item tp_device;
    public static Item t_voltmeter;

    public static void init()
    {
        tp_device = new TPDevice();
        t_voltmeter = new TVoltmeter();

        GameRegistry.registerItem(tp_device, "TPDevice");
        GameRegistry.registerItem(t_voltmeter, "TVoltmeter");
    }

}
