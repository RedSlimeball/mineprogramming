package com.mappleaf.mp.proxy;

import com.mappleaf.mp.registration.BlockRegister;
import com.mappleaf.mp.registration.ItemRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ProxyServer
{
    public void preInit(FMLPreInitializationEvent event)
    {
        BlockRegister.register();
        ItemRegister.register();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}

