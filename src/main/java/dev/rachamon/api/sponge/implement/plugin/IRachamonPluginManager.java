package dev.rachamon.api.sponge.implement.plugin;

/**
 * The interface Rachamon plugin manager.
 */
public interface IRachamonPluginManager {
    /**
     * Initialize.
     */
    public void initialize();

    /**
     * Pre initialize.
     */
    public void preInitialize();

    /**
     * Post initialize.
     */
    public void postInitialize();

    /**
     * Start.
     */
    public void start();

    /**
     * Reload.
     */
    public void reload();
}
