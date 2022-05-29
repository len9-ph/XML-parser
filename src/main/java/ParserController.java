import java.util.Comparator;
import java.util.HashMap;

/**
 * The controller that is responsible for the selection of sorting by the user
 */
public  class ParserController {
    private final HashMap<String, Comparator<Patient>> sort = new HashMap<>();

    ParserController() {
        Comparator<Patient> nameComparator = Comparator.comparing(Patient::getLastName);
        sort.put("name", nameComparator);
        Comparator<Patient> ageComparator = (o1, o2) -> (o2.getBirthday().compareTo(o1.getBirthday()));
        sort.put("age", ageComparator);
    }

    public Comparator<Patient> getComparator(String method) {
        return sort.get(method);
    }

}
