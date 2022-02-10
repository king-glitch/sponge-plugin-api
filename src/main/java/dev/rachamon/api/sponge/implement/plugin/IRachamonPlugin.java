package dev.rachamon.api.sponge.implement.plugin;

import com.google.inject.Injector;
import dev.rachamon.api.sponge.util.LoggerUtil;
import ninja.leaping.configurate.objectmapping.GuiceObjectMapperFactory;
import org.spongepowered.api.Game;
import org.spongepowered.api.plugin.PluginContainer;

import java.nio.file.Path;

public interface IRachamonPlugin {


    LoggerUtil logger = null;
    GuiceObjectMapperFactory factory = null;
    Injector spongeInjector = null;
    Game game = null;
    Injector botInjector = null;
    Path directory = null;
    PluginContainer container = null;

    public LoggerUtil getLogger();

    public void setLogger(LoggerUtil logger);

    public GuiceObjectMapperFactory getFactory();

    public void setFactory(GuiceObjectMapperFactory factory);

    public Injector getSpongeInjector();

    public void setSpongeInjector(Injector spongeInjector);

    public Game getGame();

    public void setGame(Game game);

    public Injector getBotInjector();

    public void setBotInjector(Injector botInjector);

    public Path getDirectory();

    public void setDirectory(Path directory);

    public PluginContainer getContainer();

    public void setContainer(PluginContainer container);

}
