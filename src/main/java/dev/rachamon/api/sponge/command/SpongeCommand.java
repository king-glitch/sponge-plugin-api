package dev.rachamon.api.sponge.command;

import org.spongepowered.api.command.spec.CommandSpec;

import java.util.List;

public class SpongeCommand {


    private final String[] aliases;
    private CommandSpec spec;
    private final List<SpongeCommand> children;

    /**
     * Instantiates a new Command.
     *
     * @param spec     the spec
     * @param children the children
     * @param aliases  the aliases
     */
    public SpongeCommand(CommandSpec spec, List<SpongeCommand> children, String... aliases) {
        this.children = children;
        this.aliases = aliases;
        this.spec = spec;
    }

    /**
     * Get aliases string [ ].
     *
     * @return the string [ ]
     */
    public String[] getAliases() {
        return aliases;
    }

    /**
     * Gets spec.
     *
     * @return the spec
     */
    public CommandSpec getSpec() {
        return spec;
    }

    /**
     * Gets children.
     *
     * @return the children
     */
    public List<SpongeCommand> getChildren() {
        return children;
    }

    /**
     * Sets spec.
     *
     * @param spec the spec
     */
    public void setSpec(CommandSpec spec) {
        this.spec = spec;
    }

}
