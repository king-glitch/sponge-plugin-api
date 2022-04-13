package dev.rachamon.api.sponge.provider;

public class RachamonSpongePluginProvider {

    private boolean isDebug = false;
    private static String name = "RachamonSpongeAPI";

    public RachamonSpongePluginProvider(String name, boolean debug) {
        this.isDebug = debug;
        RachamonSpongePluginProvider.name = name;

    }

    public boolean getIsDebug() {
        return this.isDebug;
    }

    public void setIsDebug(boolean isDebug) {
        this.isDebug = isDebug;
    }

    public static String getName() {
        return RachamonSpongePluginProvider.name;
    }

}
