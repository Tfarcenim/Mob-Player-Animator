package me.Thelnfamous1.mobplayeranimator;

import me.Thelnfamous1.mobplayeranimator.config.MPAClientConfigWrapper;
import me.shedaniel.autoconfig.AutoConfig;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber
@Mod(Constants.MOD_ID)
public class MobPlayerAnimatorForge {
    
    public MobPlayerAnimatorForge() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        MobPlayerAnimator.init();

        /*ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class,
                () -> new ConfigScreenHandler.ConfigScreenFactory(
                        (minecraft, screen) -> AutoConfig.getConfigScreen(MPAClientConfigWrapper.class, screen).get()));*/
    }

    @SubscribeEvent
    static void onGatherData(GatherDataEvent event){

    }
}