package svidskiy.obfuclear.utils.argparse;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Collection of command line options.
 */
public class Options {

    private final Map<String, Option> options = new HashMap<>();

    /**
     * Adds a new command line option to the collection.
     *
     * @param name        the name of the option (e.g. "--help")
     * @param description a brief description of what the option does
     * @return this instance of Options, to allow for method chaining
     */
    public Options addOption(String name, String description) {
        options.put(name, new Option(name, description));
        return this;
    }

    /**
     * Retrieves an option by its name.
     *
     * @param name the name of the desired option
     * @return the Option object corresponding to the given name
     */
    public Optional<Option> get(String name) {
        return Optional.ofNullable(options.get(name));
    }

}
