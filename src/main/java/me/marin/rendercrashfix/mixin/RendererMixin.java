package me.marin.rendercrashfix.mixin;

import net.minecraft.client.render.Camera;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityRenderDispatcher.class)
public class RendererMixin {

    @Shadow public Camera camera;

    @Inject(method="getSquaredDistanceToCamera(Lnet/minecraft/entity/Entity;)D", at = @At("HEAD"), cancellable = true)
    public void getSquaredDistanceToCamera(Entity entity, CallbackInfoReturnable<Double> cir) {
        if (this.camera == null) {
            cir.setReturnValue(0.0);
            cir.cancel();
        }
    }

    @Inject(method="getSquaredDistanceToCamera(DDD)D", at = @At("HEAD"), cancellable = true)
    public void getSquaredDistanceToCameraLocation(double x, double y, double z, CallbackInfoReturnable<Double> cir) {
        if (this.camera == null) {
            cir.setReturnValue(0.0);
            cir.cancel();
        }
    }

}
