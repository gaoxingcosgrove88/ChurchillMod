package com.gaoxing01.Churchill.init;

import com.gaoxing01.Churchill.churchill;
import net.minecraft.item.*;
import net.minecraft.item.Food.Builder;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import javax.swing.*;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = churchill.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
//makes class object holder, object holder of your mod(MOD_ID)
@ObjectHolder(churchill.MOD_ID)
public class ItemInit {
    //items
    public static final Item example_item = null;
    public static final Item example_item2 = null;
    //tools
    public static final Item example_sword = null;
    public static final Item example_pickaxe = null;
    public static final Item example_shovel = null;
    public static final Item example_axe = null;
    public static final Item example_hoe = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {

        event.getRegistry().register(new Item(new Item.Properties().group(churchill.churchillItemGroup.Instance)).setRegistryName("example_item"));
        event.getRegistry().register(new Item(new Item.Properties().group(churchill.churchillItemGroup.Instance).food(new Food.Builder().hunger(6).saturation((float) 1.2).build())).setRegistryName("example_item2"));

        //toolso
        event.getRegistry().register(new SwordItem(ModItemTier.EXAMPLE, 7, 5.0F, new Item.Properties().group(churchill.churchillItemGroup.Instance)).setRegistryName("example_sword"));
        event.getRegistry().register(new PickaxeItem(ModItemTier.EXAMPLE, 4, 5.0F, new Item.Properties().group(churchill.churchillItemGroup.Instance)).setRegistryName("example_pickaxe"));
        event.getRegistry().register(new ShovelItem(ModItemTier.EXAMPLE, 2, 5.0F, new Item.Properties().group(churchill.churchillItemGroup.Instance)).setRegistryName("example_shovel"));
        event.getRegistry().register(new AxeItem(ModItemTier.EXAMPLE, 11, 3.0F, new Item.Properties().group(churchill.churchillItemGroup.Instance)).setRegistryName("example_axe"));
        event.getRegistry().register(new HoeItem(ModItemTier.EXAMPLE, 5.0F, new Item.Properties().group(churchill.churchillItemGroup.Instance)).setRegistryName("example_hoe"));
    }

    public enum ModItemTier implements IItemTier {
        EXAMPLE(4,1500,15.0F, 7.0F, 250, () -> {
           return Ingredient.fromItems(ItemInit.example_item2);
        });

        private final int harvestlevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
            this.harvestlevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses() {
            return this.maxUses;
        }

        @Override
        public float getEfficiency() {
            return this.efficiency;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return this.harvestlevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
    }
}
