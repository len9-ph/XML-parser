import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Patient {
    String firstName;
    String middleName;
    String lastName;
    LocalDate birthday;
    String gender;
    String phone;

    public Patient() {
    }

    public Patient(String firstName, String middleName, String lastName, String birthday, String gender, String phone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.birthday = LocalDate.parse(birthday, dtf);

        this.gender = gender.equals("male") ? "М" : "Ж";
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.birthday = LocalDate.parse(birthday, dtf);
    }

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender.equals("male") ? "M" : "F";
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
