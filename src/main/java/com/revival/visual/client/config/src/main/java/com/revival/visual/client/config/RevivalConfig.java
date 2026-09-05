package com.revival.visual.client.config;

public class RevivalConfig {

    public static boolean enableHitParticles = true;
    public static ColorConfig hitParticleColorNormal = new ColorConfig(255, 215, 0, 1.0f);
    public static ColorConfig hitParticleColorCritical = new ColorConfig(255, 0, 0, 1.0f);
    public static float hitParticleScale = 1.0f;
    public static int hitParticleLifetime = 25;
    public static int hitParticleDensity = 10;

    public static boolean enableDamageNumbers = true;
    public static ColorConfig damageNumberColorNormal = new ColorConfig(255, 215, 0, 1.0f);
    public static ColorConfig damageNumberColorCritical = new ColorConfig(255, 0, 0, 1.0f);
    public static ColorConfig damageNumberColorHeal = new ColorConfig(0, 255, 0, 1.0f);
    public static float damageNumberScale = 1.0f;
    public static int damageNumberLifetime = 40;

    public static boolean enableTargetHud = true;
    public static ColorConfig targetHudBackgroundColor = new ColorConfig(20, 20, 30, 0.7f);
    public static ColorConfig targetHudHealthColor = new ColorConfig(0, 255, 0, 1.0f);
    public static ColorConfig targetHudHealthColorLow = new ColorConfig(255, 0, 0, 1.0f);
    public static ColorConfig targetHudTextColor = new ColorConfig(255, 255, 255, 1.0f);
    public static float targetHudScale = 1.0f;
    public static String targetHudMode = "CARD";

    public static boolean enableEsp = false;
    public static ColorConfig espColor = new ColorConfig(255, 0, 0, 0.5f);
    public static String espMode = "BOX";
    public static float espLineWidth = 1.5f;

    public static boolean enableHitRange = false;
    public static ColorConfig hitRangeColorIn = new ColorConfig(0, 255, 0, 0.3f);
    public static ColorConfig hitRangeColorOut = new ColorConfig(255, 0, 0, 0.3f);
    public static float hitRangeThickness = 2.0f;

    public static boolean enableTrajectory = true;
    public static ColorConfig trajectoryColor = new ColorConfig(255, 255, 255, 0.5f);
    public static float trajectoryLineWidth = 2.0f;
    public static int trajectoryMaxSteps = 200;

    public static boolean enableTrails = false;
    public static ColorConfig trailColor1 = new ColorConfig(0, 200, 255, 0.8f);
    public static ColorConfig trailColor2 = new ColorConfig(255, 0, 255, 0.4f);
    public static String trailMode = "GRADIENT";
    public static int trailLength = 50;
    public static int trailLifetime = 20;

    public static boolean enableKillEffect = true;
    public static ColorConfig killEffectColor = new ColorConfig(255, 215, 0, 1.0f);
    public static String killEffectMode = "STAR_GLOW";
    public static int killEffectParticleCount = 30;
    public static float killEffectScale = 1.0f;

    public static boolean enableCritEffect = true;
    public static ColorConfig critEffectColor = new ColorConfig(255, 50, 50, 1.0f);
    public static float critEffectScale = 1.5f;
    public static int critEffectDuration = 15;

    public static boolean enableCustomCrosshair = true;
    public static ColorConfig crosshairColor = new ColorConfig(255, 255, 255, 1.0f);
    public static String crosshairStyle = "CROSS";
    public static float crosshairScale = 1.0f;

    public static boolean enableLowFire = false;
    public static float fireHeight = 0.0f;

    public static boolean enableSmallShield = false;
    public static float shieldScale = 0.5f;
    public static boolean enableSmallTotem = false;
    public static float totemScale = 0.5f;

    public static boolean enableSwordTilt = false;
    public static float swordTiltAngle = 15.0f;

    public static boolean enableFullbright = false;
    public static float fullbrightLevel = 15.0f;

    public static boolean enableCoordinatesHud = true;
    public static ColorConfig coordinatesColor = new ColorConfig(255, 255, 255, 0.8f);

    public static boolean enableArmorHud = true;
    public static ColorConfig armorHudColor = new ColorConfig(0, 255, 0, 1.0f);
    public static ColorConfig armorHudLowColor = new ColorConfig(255, 0, 0, 1.0f);

    public static boolean enablePinger = true;
    public static int pingerThreshold = 20;
    public static ColorConfig pingerColor = new ColorConfig(255, 0, 0, 1.0f);
    public static boolean pingerSound = true;

    public static ColorConfig themePrimary = new ColorConfig(200, 0, 0, 1.0f);
    public static ColorConfig themeSecondary = new ColorConfig(30, 30, 30, 1.0f);
    public static ColorConfig themeBackground = new ColorConfig(15, 15, 20, 0.9f);
}
