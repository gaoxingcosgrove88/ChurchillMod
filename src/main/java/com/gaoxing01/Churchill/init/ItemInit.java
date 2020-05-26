package com.gaoxing01.Churchill.init;

import com.gaoxing01.Churchill.churchill;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = churchill.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
//makes class object holder, object holder of your mod(MOD_ID)
@ObjectHolder(churchill.MOD_ID)
public class ItemInit {

    public static final Item example_item = null;
    public static final Item example_item2 = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {

        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item2"));
    }
}
