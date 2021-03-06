package dev.rachamon.api.sponge.implement.command;

import dev.rachamon.api.sponge.util.TextUtil;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;

import javax.annotation.Nonnull;

/**
 * The interface Player command.
 */
public interface IPlayerCommand extends CommandExecutor {
    @Override
    @Nonnull
    default CommandResult execute(@Nonnull CommandSource src, @Nonnull CommandContext args) throws CommandException {
        if (!(src instanceof Player)) {
            throw new CommandException(TextUtil.toText("Must be in-game to execute this command."));
        }

        return execute((Player) src, args);
    }

    /**
     * Execute command result.
     *
     * @param source the source
     * @param args   the args
     * @return the command result
     * @throws CommandException the guild command exception
     */
    @Nonnull
    CommandResult execute(@Nonnull Player source, @Nonnull CommandContext args) throws CommandException;
}
