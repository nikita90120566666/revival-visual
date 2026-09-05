package com.revival.visual;

import com.revival.visual.client.gui.ClickGuiScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class RevivalVisualClient implements ClientModInitializer {

    private static KeyBinding menuKey;

    @Override
    public void onInitializeClient() {
        System.out.println("Revival Visual loaded!");

        menuKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.revival.menu",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_RIGHT_SHIFT,
            "Revival Visual"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (menuKey.wasPressed()) {
                MinecraftClient.getInstance().setScreen(new ClickGuiScreen());
            }
        });
    }
}
