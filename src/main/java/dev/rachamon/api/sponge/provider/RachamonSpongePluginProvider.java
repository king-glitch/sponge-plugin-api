package dev.rachamon.api.sponge.provider;

public class RachamonSpongePluginProvider {

    private static boolean isDebug = false;
    private static String name = "RachamonSpongeAPI";

    public RachamonSpongePluginProvider(String name, boolean debug) {

        RachamonSpongePluginProvider.isDebug = debug;
        RachamonSpongePluginProvider.name = name;

    }

    public static boolean getIsDebug() {
        return RachamonSpongePluginProvider.isDebug;
    }

    public static String getName() {
        return RachamonSpongePluginProvider.name;
    }

}
