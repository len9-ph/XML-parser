import java.util.Comparator;

public class namePatientComporator implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}