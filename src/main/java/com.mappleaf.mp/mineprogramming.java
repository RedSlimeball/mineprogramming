package com.mappleaf.mp;

import com.mappleaf.mp.proxy.ProxyServer;
import com.mappleaf.mp.utils.Constants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = Constants.MODID, name = Constants.NAME, version = Constants.VERSION, useMetadata = true)
public class mineprogramming {

    private static Logger logger;
    @SidedProxy(clientSide = Constants.PROXYCLIENT, serverSide = Constants.PROXYSERVER)
    public static ProxyServer proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        Constants.ModMetadata(event.getModMetadata ());
        logger = event.getModLog();
        System.out.println("\u001B[32m" + "[Starting Test Mod PRE-INITIALIZATION]" + "\u001B[0m");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        System.out.println("\u001B[32m" + "[Starting Test Mod INITIALIZATION]" + "\u001B[0m");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
        System.out.println("\u001B[32m" + "[Starting Test Mod POST-INITIALIZATION]" + "\u001B[0m");
    }
}