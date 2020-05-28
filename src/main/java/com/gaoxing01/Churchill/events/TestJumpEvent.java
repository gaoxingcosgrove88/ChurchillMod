/*package com.gaoxing01.Churchill.events;

import com.gaoxing01.Churchill.churchill;

import com.gaoxing01.Churchill.init.BlockInit;
import javafx.scene.effect.Effect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//change value according to what the event needs
@Mod.EventBusSubscriber(modid = churchill.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TestJumpEvent {
    @SubscribeEvent
    public static void TestJumpEvent(LivingEvent.LivingJumpEvent event){
        churchill.LOGGER.info("Jump!");
        LivingEntity livingEntity = event.getEntityLiving();
        World world = livingEntity.getEntityWorld();
        world.setBlockState(livingEntity.getPosition().add(0,5,0), BlockInit.example_block.getDefaultState());
        livingEntity.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 5000, 255));
        livingEntity.setGlowing(true);
    }

}
*/