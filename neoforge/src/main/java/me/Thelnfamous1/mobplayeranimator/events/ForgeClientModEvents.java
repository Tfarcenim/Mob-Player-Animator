package me.Thelnfamous1.mobplayeranimator.events;

import me.Thelnfamous1.mobplayeranimator.MobPlayerAnimatorClient;
import me.Thelnfamous1.mobplayeranimator.Constants;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = Constants.MOD_ID, value = Dist.CLIENT)
public class ForgeClientModEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
        MobPlayerAnimatorClient.init();
    }
}