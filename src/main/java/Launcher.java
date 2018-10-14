import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * This class is launcher for syntax analyzer application.
 */
public class Launcher {

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"));

        Parser parser = new Parser();
        TreePrinter treePrinter = new TreePrinter(out);
        treePrinter.print(parser.parse(new File("in.txt")));

        out.close();
    }
}
