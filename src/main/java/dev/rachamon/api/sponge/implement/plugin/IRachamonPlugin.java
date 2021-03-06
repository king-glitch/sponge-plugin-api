package dev.rachamon.api.sponge.implement.plugin;

import dev.rachamon.api.sponge.command.SpongeCommandService;
import dev.rachamon.api.sponge.util.LoggerUtil;
import ninja.leaping.configurate.objectmapping.GuiceObjectMapperFactory;
import org.spongepowered.api.Game;
import org.spongepowered.api.plugin.PluginContainer;

import java.nio.file.Path;

/**
 * The interface Rachamon plugin.
 */
public interface IRachamonPlugin {


    /**
     * The constant isInitialized.
     */
    boolean isInitialized = false;

    /**
     * The constant factory.
     */
    GuiceObjectMapperFactory factory = null;
    /**
     * The constant game.
     */
    Game game = null;
    /**
     * The constant directory.
     */
    Path directory = null;
    /**
     * The constant container.
     */
    PluginContainer container = null;

    /**
     * Gets logger.
     *
     * @return the logger
     */
    public LoggerUtil getLogger();

    /**
     * Gets factory.
     *
     * @return the factory
     */
    public GuiceObjectMapperFactory getFactory();


    /**
     * Gets game.
     *
     * @return the game
     */
    public Game getGame();

    /**
     * Gets directory.
     *
     * @return the directory
     */
    public Path getDirectory();

    /**
     * Gets container.
     *
     * @return the container
     */
    public PluginContainer getContainer();

    /**
     * Gets command service.
     *
     * @return the command service
     */
    public SpongeCommandService getCommandService();

    /**
     * Gets plugin manager.
     *
     * @return the plugin manager
     */
    public IRachamonPluginManager getPluginManager();

    /**
     * Is initialized boolean.
     *
     * @return the boolean
     */
    public boolean isInitialized();

    /**
     * Sets initialized.
     *
     * @param isInitialized the is initialized
     */
    public void setInitialized(boolean isInitialized);

}
