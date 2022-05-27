import java.util.Comparator;
import java.util.HashMap;

public  class ParserController {
    private HashMap<String, Comparator<Patient>> sort = new HashMap<>();

    private Comparator<Patient> nameComparator = (o1, o2) -> o1.getLastName().compareTo(o2.getLastName());
    private Comparator<Patient> ageComparator = (o1, o2) -> (int) (o1.getBirthday().getTime() - o2.getBirthday().getTime());

    ParserController() {
        sort.put("name", nameComparator);
        sort.put("age", ageComparator);
    }

    public Comparator<Patient> getComparator(String method) {
        return sort.get(method);
    }

}
