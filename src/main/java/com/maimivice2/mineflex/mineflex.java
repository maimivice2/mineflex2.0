package com.maimivice2.mineflex;

import com.maimivice2.mineflex.proxy.Iproxy;
import com.oracle.jrockit.jfr.EventDefinition;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="mineflex", name="mineflex v1.0", version="1.7.10-1.0")
public class mineflex
{
    @Mod.Instance ("mineflex")
    public static mineflex instance;

    @SidedProxy(clientSide = "com.maimivice2.mineflex.proxy.Clientproxy", serverSide = "com.maimivice2.mineflex.proxy.Serverproxy")
    public static Iproxy iproxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {


    }

    @Mod.EventHandler
    public void Init (FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void PostInit (FMLPostInitializationEvent event)
    {


    }

}
