package dev.rachamon.api.sponge.util;

import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.serializer.TextSerializers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The type Text util.
 */
public class TextUtil {
    /**
     * To text text.
     *
     * @param string the string
     * @return the text
     */
    public static Text toText(String string) {
        return TextSerializers.FORMATTING_CODE.deserialize(string);
    }

    /**
     * Strip color string.
     *
     * @param symbol the symbol
     * @param str    the str
     * @return the string
     */
    public static String stripColor(char symbol, String str) {
        return str.replaceAll("(" + symbol + "([A-Fa-fK-Ok-oRr0-9]))", "");
    }

    /**
     * Gets last color.
     *
     * @param str the str
     * @return the last color
     */
    public static String getLastColor(String str) {
        if (str.length() > 2) {
            Pattern pattern = Pattern.compile("(&([A-Fa-f0-9])(&([K-Ok-oRr]))?)", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(str);
            String s = "";
            while (matcher.find()) {
                s = matcher.group();
            }
            return s;
        }
        return "";
    }
}
