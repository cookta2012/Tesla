package me.modforgery.tesla;

import me.modforgery.tesla.init.TeslaItems;
import me.modforgery.tesla.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Rushmead For Tesla
 */
public class CreativeTabTesla
{
    public static final CreativeTabs TS_TAB = new CreativeTabs(Reference.modid.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return TeslaItems.tp_device;
        }
    };

}
