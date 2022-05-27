import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        try {
            Processor processor = new Processor(args[0], args[1]);
            processor.run();
        }
        catch (Exception e){
            System.out.println("You forgot path");
        }
    }
}
