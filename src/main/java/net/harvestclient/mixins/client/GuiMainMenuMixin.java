package net.harvestclient.mixins.client;

import net.minecraft.client.gui.GuiMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiMainMenu.class)
public abstract class GuiMainMenuMixin {
    @Shadow String splashText;

    @Inject(method = "initGui", at = @At("RETURN"))
    void onInitGui(CallbackInfo ci) {
        this.splashText = "MIXIN OwO";
    }
}
