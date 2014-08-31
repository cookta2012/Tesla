package me.modforgery.tesla.proxy;

import me.modforgery.tesla.block.te.TileEntityTeslaCoil;
import me.modforgery.tesla.block.te.TileEntityVDGGenerator;
import me.modforgery.tesla.block.tesr.TileEntityRenderTeslaCoil;
import me.modforgery.tesla.block.tesr.TileEntityRenderVDGGenerator;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */
public class ClientProxy implements IProxy {
	
	@Override
	public void initRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVDGGenerator.class, new TileEntityRenderVDGGenerator());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTeslaCoil.class, new TileEntityRenderTeslaCoil());
	}
}
