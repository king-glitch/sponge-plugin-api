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
    private String name = "RachamonSpongeAPI";
    private final ConsoleSource console;
    private boolean debug = false;

    /**
     * Instantiates a new Logger util.
     *
     * @param server the server
     */
    public LoggerUtil(Server server, String name) {
        this.console = server.getConsole();
        this.name = name;
    }

    /**
     * Info.
     *
     * @param message the message
     */
    public void info(String message) {
        console.sendMessage(TextUtil.toText("&8[&4&l" + this.getName() + "&8][&bINFO&8]&7: &a" + message));
    }

    /**
     * Success.
     *
     * @param message the message
     */
    public void success(String message) {
        console.sendMessage(TextUtil.toText("&8[&4&l" + this.getName() + "&8][&aSUCCESS&8]&7: &a" + message));
    }

    /**
     * Error.
     *
     * @param message the message
     */
    public void error(String message) {
        console.sendMessage(TextUtil.toText("&8[&4&l" + this.getName() + "&8][&cERROR&8]&7: &a" + message));

    }

    /**
     * Warning.
     *
     * @param message the message
     */
    public void warning(String message) {
        console.sendMessage(TextUtil.toText("&8[&4&l" + this.getName() + "&8][&eWARNING&8]&7: &a" + message));
    }

    /**
     * Warning.
     *
     * @param message the message
     */
    public void warning(java.lang.StackTraceElement[] message) {
        console.sendMessage(TextUtil.toText("&8[&4&l" + this.getName() + "&8][&eWARNING&8]&7: &a" + Arrays.toString(message)));
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
        if (!this.getDebug()) return;
        console.sendMessage(TextUtil.toText("&8[&4&l" + this.getName() + "&8][&dDEBUG&8]&7: &a" + message));
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public boolean getDebug() {
        return this.debug;
    }

    public String getName() {
        return this.name;
    }
}