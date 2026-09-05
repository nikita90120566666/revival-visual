package com.revival.visual.client.gui;

import com.revival.visual.client.config.RevivalConfig;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class ClickGuiScreen extends Screen {

    public ClickGuiScreen() {
        super(Text.literal("Revival Visual"));
    }

    @Override
    protected void init() {
        int x = 10;
        int y = 30;

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Hit Particles: " + (RevivalConfig.enableHitParticles ? "ON" : "OFF")),
            btn -> {
                RevivalConfig.enableHitParticles = !RevivalConfig.enableHitParticles;
                btn.setMessage(Text.literal("Hit Particles: " + (RevivalConfig.enableHitParticles ? "ON" : "OFF")));
            }
        ).dimensions(x, y, 200, 20).build());
        y += 25;

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Damage Numbers: " + (RevivalConfig.enableDamageNumbers ? "ON" : "OFF")),
            btn -> {
                RevivalConfig.enableDamageNumbers = !RevivalConfig.enableDamageNumbers;
                btn.setMessage(Text.literal("Damage Numbers: " + (RevivalConfig.enableDamageNumbers ? "ON" : "OFF")));
            }
        ).dimensions(x, y, 200, 20).build());
        y += 25;

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Target HUD: " + (RevivalConfig.enableTargetHud ? "ON" : "OFF")),
            btn -> {
                RevivalConfig.enableTargetHud = !RevivalConfig.enableTargetHud;
                btn.setMessage(Text.literal("Target HUD: " + (RevivalConfig.enableTargetHud ? "ON" : "OFF")));
            }
        ).dimensions(x, y, 200, 20).build());
        y += 25;

        addDrawableChild(ButtonWidget.builder(
            Text.literal("ESP: " + (RevivalConfig.enableEsp ? "ON" : "OFF")),
            btn -> {
                RevivalConfig.enableEsp = !RevivalConfig.enableEsp;
                btn.setMessage(Text.literal("ESP: " + (RevivalConfig.enableEsp ? "ON" : "OFF")));
            }
        ).dimensions(x, y, 200, 20).build());
        y += 25;

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Hit Range: " + (RevivalConfig.enableHitRange ? "ON" : "OFF")),
            btn -> {
                RevivalConfig.enableHitRange = !RevivalConfig.enableHitRange;
                btn.setMessage(Text.literal("Hit Range: " + (RevivalConfig.enableHitRange ? "ON" : "OFF")));
            }
        ).dimensions(x, y, 200, 20).build());
        y += 25;

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Trajectory: " + (RevivalConfig.enableTrajectory ? "ON" : "OFF")),
            btn -> {
                RevivalConfig.enableTrajectory = !RevivalConfig.enableTrajectory;
                btn.setMessage(Text.literal("Trajectory: " + (RevivalConfig.enableTrajectory ? "ON" : "OFF")));
            }
        ).dimensions(x, y, 200, 20).build());
        y += 25;

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Crosshair: " + (RevivalConfig.enableCustomCrosshair ? "ON" : "OFF")),
            btn -> {
                RevivalConfig.enableCustomCrosshair = !RevivalConfig.enableCustomCrosshair;
                btn.setMessage(Text.literal("Crosshair: " + (RevivalConfig.enableCustomCrosshair ? "ON" : "OFF")));
            }
        ).dimensions(x, y, 200, 20).build());
        y += 25;

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Coordinates: " + (RevivalConfig.enableCoordinatesHud ? "ON" : "OFF")),
            btn -> {
                RevivalConfig.enableCoordinatesHud = !RevivalConfig.enableCoordinatesHud;
                btn.setMessage(Text.literal("Coordinates: " + (RevivalConfig.enableCoordinatesHud ? "ON" : "OFF")));
            }
        ).dimensions(x, y, 200, 20).build());
        y += 25;

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Armor HUD: " + (RevivalConfig.enableArmorHud ? "ON" : "OFF")),
            btn -> {
                RevivalConfig.enableArmorHud = !RevivalConfig.enableArmorHud;
                btn.setMessage(Text.literal("Armor HUD: " + (RevivalConfig.enableArmorHud ? "ON" : "OFF")));
            }
        ).dimensions(x, y, 200, 20).build());
        y += 25;

        addDrawableChild(ButtonWidget.builder(
            Text.literal("Fullbright: " + (RevivalConfig.enableFullbright ? "ON" : "OFF")),
            btn -> {
                RevivalConfig.enableFullbright = !RevivalConfig.enableFullbright;
                btn.setMessage(Text.literal("Fullbright: " + (RevivalConfig.enableFullbright ? "ON" : "OFF")));
            }
        ).dimensions(x, y, 200, 20).build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        context.drawCenteredTextWithShadow(this.textRenderer, "Revival Visual", this.width / 2, 10, 0xFFFFFF);
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
