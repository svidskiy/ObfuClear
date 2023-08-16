package svidskiy.obfuclear;

import svidskiy.obfuclear.utils.argparse.Parser;
import svidskiy.obfuclear.utils.argparse.Options;
import svidskiy.obfuclear.utils.argparse.ParsedOptions;

/**
 * The main class to execute the deobfuscation process.
 * It parses the command line arguments, specifically looking for the configuration path for the deobfuscation.
 */
public class ObfuClear {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Deobfuscator deobfuscator = new Deobfuscator();

        Options options = new Options().addOption("--config", "Path to the config for the deobfuscator operation");

        try {
            ParsedOptions parsedOptions = parser.parse(options, args);

            String configPath = parsedOptions.get("config");

            deobfuscator.deobfuscate(configPath);
        } catch (Exception error) {
            System.out.println("Error parsing command line options: " + error.getMessage());
        }
    }
}
