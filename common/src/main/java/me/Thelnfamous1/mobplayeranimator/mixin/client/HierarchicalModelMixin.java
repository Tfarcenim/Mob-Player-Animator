package me.Thelnfamous1.mobplayeranimator.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Function;

@Mixin(HierarchicalModel.class)
public abstract class HierarchicalModelMixin<E extends Entity> extends EntityModelMixin<E> {

    public HierarchicalModelMixin(Function<ResourceLocation, RenderType> $$0) {
        super($$0);
    }

    @Inject(method = "renderToBuffer", at = @At("HEAD"), cancellable = true)
    private void pre_renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, int color, CallbackInfo ci){
        if(this.mobplayeranimator$bendRenderToBuffer(poseStack, buffer, packedLight, packedOverlay, color)){
            ci.cancel();
        }
    }

    @Unique
    protected boolean mobplayeranimator$bendRenderToBuffer(PoseStack matrices, VertexConsumer vertices, int light, int overlay,int red) {
        return false;
    }
}
