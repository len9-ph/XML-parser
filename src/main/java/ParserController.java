import java.util.Comparator;
import java.util.HashMap;

public  class ParserController {
    private HashMap<String, Comparator<Patient>> sort = new HashMap<>();

    private Comparator<Patient> nameComparator = (o1, o2) -> o1.getLastName().compareTo(o2.getLastName());
    private Comparator<Patient> ageComparator = (o1, o2) -> o1.getBirthday().compareTo(o2.getBirthday());

    ParserController() {
        sort.put("name", nameComparator);
        sort.put("age", ageComparator);
    }

    public Comparator<Patient> getComparator(String method) {
        return sort.get(method);
    }

}
