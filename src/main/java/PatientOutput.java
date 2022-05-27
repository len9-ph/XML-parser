import java.util.Collection;

public class PatientOutput {

      public void output(Collection<Patient> patients){
          System.out.format("%-45s %-10s %-10s %-15s", "ФИО\t", "Возраст\t", "Пол\t", "Телефон\t ");
          System.out.println();
          for(Patient x : patients) {
              System.out.format("%-32s\t %-10tY\t %-10s\t %-10s\t", x.getLastName() + " " + x.getFirstName() + " " + x.getMiddleName(),
                      x.getBirthday(), x.getGender(), x.getPhone());
              System.out.println();
          }
      }
}
