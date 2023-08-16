package svidskiy.obfuclear.utils.argparse;

/**
 * A parser for command line arguments, which extracts and matches
 * provided arguments based on the available options.
 */
public class Parser {

    /**
     * Parses the provided arguments based on the given options.
     *
     * The method processes each argument sequentially. If it encounters an argument
     * starting with "--", it's considered an option name. The subsequent argument
     * (if it exists) is taken as the option's value.
     *
     * @param options the expected command line options
     * @param args    the command line arguments
     * @return a map where the key is the option name and the value is the associated value from args
     */
    public ParsedOptions parse(Options options, String[] args) throws Exception {
        ParsedOptions parsedOptions = new ParsedOptions();

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (arg.startsWith("--")) {
                String optionName = arg.substring(2);

                Option option = options.get(optionName).orElseThrow(() -> new Exception("Unknown option: " + arg));

                if (++i < args.length) {
                    parsedOptions.addOption(option.name(), args[i]);
                }
            }
        }

        return parsedOptions;
    }

}
