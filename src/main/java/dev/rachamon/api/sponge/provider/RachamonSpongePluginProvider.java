package dev.rachamon.api.sponge.provider;

public abstract class RachamonSpongePluginProvider {

    private static String name = "RachamonSpongeAPI";

    public RachamonSpongePluginProvider(String name) {
        RachamonSpongePluginProvider.name = name;

    }

    public static String getName() {
        return RachamonSpongePluginProvider.name;
    }

}
