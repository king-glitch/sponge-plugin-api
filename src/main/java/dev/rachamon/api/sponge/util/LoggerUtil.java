package dev.rachamon.api.sponge.util;

import dev.rachamon.api.sponge.provider.RachamonSpongePluginProvider;
import org.spongepowered.api.Server;
import org.spongepowered.api.command.source.ConsoleSource;
import org.spongepowered.api.text.Text;

import java.util.Arrays;

/**
 * The type Logger util.
 */
public class LoggerUtil {
    private final ConsoleSource console;

    /**
     * Instantiates a new Logger util.
     *
     * @param server the server
     */
    public LoggerUtil(Server server) {
        this.console = server.getConsole();
    }

    /**
     * Info.
     *
     * @param message the message
     */
    public void info(String message) {
        console.sendMessage(TextUtil.toText("&8[&4&l" + RachamonSpongePluginProvider.getName() + "&8][&bINFO&8]&7: &a" + message));
    }

    /**
     * Success.
     *
     * @param message the message
     */
    public void success(String message) {
        console.sendMessage(TextUtil.toText("&8[&4&l" + RachamonSpongePluginProvider.getName() + "&8][&aSUCCESS&8]&7: &a" + message));
    }

    /**
     * Error.
     *
     * @param message the message
     */
    public void error(String message) {
        console.sendMessage(TextUtil.toText("&8[&4&l" + RachamonSpongePluginProvider.getName() + "&8][&cERROR&8]&7: &a" + message));

    }

    /**
     * Warning.
     *
     * @param message the message
     */
    public void warning(String message) {
        console.sendMessage(TextUtil.toText("&8[&4&l" + RachamonSpongePluginProvider.getName() + "&8][&eWARNING&8]&7: &a" + message));
    }

    /**
     * Warning.
     *
     * @param message the message
     */
    public void warning(java.lang.StackTraceElement[] message) {
        console.sendMessage(TextUtil.toText("&8[&4&l" + RachamonSpongePluginProvider.getName() + "&8][&eWARNING&8]&7: &a" + Arrays.toString(message)));
    }

    /**
     * Raw.
     *
     * @param message the message
     */
    public void raw(String message) {
        console.sendMessage(Text.of(message));
    }

    /**
     * Debug.
     *
     * @param message the message
     */
    public void debug(String message) {
        if (!RachamonSpongePluginProvider.getIsDebug()) return;
        console.sendMessage(TextUtil.toText("&8[&4&l" + RachamonSpongePluginProvider.getName() + "&8][&dDEBUG&8]&7: &a" + message));


    }
}