import java.util.regex.*;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {

        Pattern regex = Pattern.compile("(\\d{0,3}\\.){3}\\d{0,3}");
        Pattern regexExclamationMark = Pattern.compile("(\\d{0,3}\\.){3}\\d{0,3}(!$)");

        Matcher matchRegex = regex.matcher(text);
        Matcher matchRegexExpMark = regexExclamationMark.matcher(text);

        if (matchRegex.find() && (!matchRegexExpMark.find())) {
            return matchRegex.group();
        } else {
            return "";
        }
    }
}