import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        PatientHandler patientHandler = new PatientHandler();
        parser.parse(new File("C:\\Users\\Леонид\\IdeaProjects\\XML-parser\\src\\main\\resources\\file.xml"), patientHandler);
        LinkedList<Patient> list = patientHandler.getPatients();
        if(list.isEmpty())
            System.out.println("ogo");
        /*for (Patient x : list){
            System.out.println(x.getFirstName());
            System.out.println(x.getMiddleName());
            System.out.println(x.getLastName());
            System.out.println(x.getPhone());
            System.out.println(x.getBirthday());
            System.out.println(x.getGender());
        }*/
    }
}
