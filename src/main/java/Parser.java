import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

/* TODO
*   1) Write README
*   3) Make it work with Cyrillic
* */

public class Parser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        try {
            Processor processor = new Processor("C:\\Users\\leoni\\IdeaProjects\\XML-parser\\src\\main\\resources\\file.xml", "age");
            processor.run();
            PatientOutput patientOutput = new PatientOutput();
            patientOutput.output(processor.getPatients());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
