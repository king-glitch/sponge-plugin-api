package dev.rachamon.api.sponge.implement.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The interface Command permission.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ICommandPermission {
    /**
     * Value string.
     *
     * @return the string
     */
    String value();
}
