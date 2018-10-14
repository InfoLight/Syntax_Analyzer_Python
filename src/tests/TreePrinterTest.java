import org.junit.*;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class TreePrinterTest {

    @Test
    public void toJson() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("testout.txt"));
        Parser parser = new Parser();
        TreePrinter treePrinter = new TreePrinter(out);

        treePrinter.print(parser.parse(new File("testin.txt")));

        String testJSON = new String (Files.readAllBytes(Paths.get("testGSON.txt")));
        testJSON = testJSON.replaceAll("\\r", "");
        String realJSON = (treePrinter.toJson(parser.parse(new File("testin.txt")), true)).toString();
        assertEquals(testJSON, realJSON);
    }
}