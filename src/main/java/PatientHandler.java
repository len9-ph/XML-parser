import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.LinkedList;
import java.util.Objects;

public class PatientHandler extends DefaultHandler {
    private LinkedList<Patient> patients = new LinkedList<>();
    private Patient currentPatient = new Patient();
    private String currentElement;

    public LinkedList<Patient> getPatients() {
        return patients;
    }

    @Override
    public void startDocument() throws SAXException {
        patients = new LinkedList<>();
        System.out.println("Start parse XML...");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Stop parse XML.");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentElement = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        /*if(currentPatient.isFull() && currentElement.equals("")) {
            currentPatient.print();
            //patients.add(currentPatient);
            //System.out.println("CurrentElement: " + currentElement);
        }*/
        //System.out.println("CurrentElement: " + currentElement);
        currentElement = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        switch (currentElement) {
            case "patient" -> currentPatient = new Patient();
            case "first_name" -> currentPatient.setFirstName(new String(ch, start, length));
            case "middle_name" -> currentPatient.setMiddleName(new String(ch, start, length));
            case "last_name" -> currentPatient.setLastName(new String(ch, start, length));
            case "birthday" -> currentPatient.setBirthday(new String(ch, start, length));
            case "gender" -> currentPatient.setGender(new String(ch, start, length));
            case "phone" -> {
                currentPatient.setPhone(new String(ch, start, length));
                patients.add(currentPatient);
            }
        }
    }
}
