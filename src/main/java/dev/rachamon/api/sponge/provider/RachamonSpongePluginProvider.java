package dev.rachamon.api.sponge.provider;

import dev.rachamon.api.sponge.util.LoggerUtil;
import org.spongepowered.api.Server;

public class RachamonSpongePluginProvider {

    private String name = "RachamonSpongeAPI";
    private boolean debug = false;
    private final LoggerUtil logger;

    public RachamonSpongePluginProvider(String name, Server server, boolean debug) {
        this.name = name;
        this.debug = debug;
        this.logger = new LoggerUtil(server, name);
    }

    public RachamonSpongePluginProvider(String name, Server server) {
        this.name = name;
        this.logger = new LoggerUtil(server, name);
    }

    public String getName() {
        return this.name;
    }

    public boolean getDebug() {
        return this.debug;
    }

    public LoggerUtil getLogger() {
        return logger;
    }
}
