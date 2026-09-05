package com.revival.visual.client.config;

public class ColorConfig {
    public int r, g, b;
    public float a;

    public ColorConfig(int r, int g, int b, float a) {
        this.r = Math.max(0, Math.min(255, r));
        this.g = Math.max(0, Math.min(255, g));
        this.b = Math.max(0, Math.min(255, b));
        this.a = Math.max(0.0f, Math.min(1.0f, a));
    }

    public int toARGB() {
        return ((int)(a * 255) << 24) | (r << 16) | (g << 8) | b;
    }

    public String toHex() {
        return String.format("#%02X%02X%02X%02X", r, g, b, (int)(a * 255));
    }

    public static ColorConfig fromHex(String hex) {
        hex = hex.replace("#", "");
        if (hex.length() >= 6) {
            int r = Integer.parseInt(hex.substring(0, 2), 16);
            int g = Integer.parseInt(hex.substring(2, 4), 16);
            int b = Integer.parseInt(hex.substring(4, 6), 16);
            float a = hex.length() >= 8 ? Integer.parseInt(hex.substring(6, 8), 16) / 255f : 1.0f;
            return new ColorConfig(r, g, b, a);
        }
        return new ColorConfig(255, 255, 255, 1.0f);
    }
}
