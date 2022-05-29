import java.util.Collection;

/**
 * The class that is responsible for the output
 */
public class PatientOutput {

    public void output(Collection<Patient> patients){
        String leftAlignFormat = "|%-30s|%-7d|%-4s|%-15s|%n";

        System.out.format("+------------------------------+-------+----+---------------+%n");
        System.out.format("|ФИО                           |Возраст|Пол |Телефон        |%n");
        System.out.format("+------------------------------+-------+----+---------------+%n");

        for(Patient x : patients) {
            System.out.format(leftAlignFormat, x.getLastName() + " " + x.getFirstName() + " " + x.getMiddleName(),
                    x.getAge(), x.getGender(), x.getPhone());
        }
        System.out.format("+------------------------------+-------+----+---------------+%n");
      }
}
