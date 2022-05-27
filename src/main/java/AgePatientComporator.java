import java.util.Comparator;

public class AgePatientComporator implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
