import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.*;

public class Processor {
    private final Collection<Patient> patients;
    private final ParserController parserController;

    private final String  path;

    Processor(String path) {
        this.path = path;
        this.patients = new ArrayList<>();
        this.parserController = null;
    }

    Processor(String path, String method) {
        this.path = path;
        this.parserController = new ParserController();
        this.patients =  new TreeSet<>(parserController.getComparator(method));
    }

    public Collection<Patient> getPatients() {
        return patients;
    }

    public void run() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        PatientHandler patientHandler = new PatientHandler();
        parser.parse(path, patientHandler);
        patients.addAll(patientHandler.getPatients());
    }

    /*public Collection<Patient> getPatients(){
        return patients;
    }*/


    /* HashMap<String, Comparator<Patient>> sortMethods;
    ArrayList<Patient> listOfPatients;

    Comparator<Patient> nameComparator = (o1, o2) -> o1.getLastName().compareTo(o2.getLastName());
    Comparator<Patient> ageComparator = (o1, o2) -> o1.getBirthday().compareTo(o2.getBirthday());

    Processor(){
        sortMethods = new HashMap<>();
        sortMethods.put("age", ageComparator);
        sortMethods.put("name", nameComparator);
    }*/

}
