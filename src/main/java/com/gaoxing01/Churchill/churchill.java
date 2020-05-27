package com.gaoxing01.Churchill;


import com.gaoxing01.Churchill.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("churchill")
public class churchill
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "churchill";
    public static churchill instance;

    public churchill() {
        //more convenient coding
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
        modEventBus.addListener(this::setup);

        // Register the doClientStuff method for modloading
        modEventBus.addListener(this::doClientStuff);
        instance = this;

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client

    }

    public static class churchillItemGroup extends ItemGroup{

        public static final churchillItemGroup Instance = new churchillItemGroup(ItemGroup.GROUPS.length, "churchilltab");

        private churchillItemGroup(int index, String label){
            super(index,label);
        }
        @Override
        public ItemStack createIcon(){
            return new ItemStack(BlockInit.example_block);
        }
    }

}


