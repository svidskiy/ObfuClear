package svidskiy.obfuclear.utils.argparse;

import java.util.HashMap;
import java.util.Map;

/**
 * Collection of parsed options from command-line arguments.
 */
public class ParsedOptions {
    private final Map<String, String> options = new HashMap<>();

    /**
     * Adds a new option to the collection.
     *
     * @param name  the name of the option.
     * @param value the value associated with the option.
     */
    public void addOption(String name, String value) {
        options.put(name, value);
    }

    /**
     * Retrieves the value of an option by its name.
     *
     * @param name the name of the option.
     * @return the value associated with the option, or null if the option is not present.
     */
    public String get(String name) {
        return options.get(name);
    }
}
