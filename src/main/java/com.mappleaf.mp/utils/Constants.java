package com.mappleaf.mp.utils;

import net.minecraftforge.fml.common.ModMetadata;

import java.util.Arrays;
import java.util.List;

public class Constants {
    public static final String
            MODID = "minep",
            NAME = "Mineprogramming",
            VERSION = "0.0.1d",
            PROXYSERVER = "com.mappleaf.mp.proxy.ProxyServer",
            PROXYCLIENT = "com.mappleaf.mp.proxy.ProxyClient",
            DESCRIPTION = "DESCRIPTION",
            URL = "URL",
            UPDATEURL = "",
            LOGO = "",
            CREDITS = "CREDITS",
            SCREENS = "",
    ////
    TPATH = "",
    ////
    PREFIX_MOD = MODID+":";
    public static final List<String> AUTHORS = Arrays.asList(new String[]{"KuroIShiro"});
    public static void ModMetadata(ModMetadata meta) {
        meta.autogenerated = false;
        meta.modId = MODID;
        meta.name = NAME;
        meta.version = VERSION;
        meta.authorList = AUTHORS;
        meta.url = URL;
        meta.description = DESCRIPTION;
    }
}