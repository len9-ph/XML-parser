import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //System.out.format("%-10s %-10s %-10s %-10s", "ФИО", "Возраст", "Пол", "Телефон");
        Processor processor = new Processor("C:\\Users\\leoni\\IdeaProjects\\XML-parser\\src\\main\\resources\\file.xml", "name");
        processor.run();

    }
}
