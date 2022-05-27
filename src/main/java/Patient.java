import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Objects;

public class Patient {
    String firstName;
    String middleName;
    String lastName;
    Date birthday;
    String gender;
    String phone;

    public Patient() {
    }

    public Patient(String firstName, String middleName, String lastName, String birthday, String gender, String phone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.birthday = (Date) dtf.parse(birthday);

        /*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = (LocalDate) dtf.parse(birthday);
        this.birthday = Period.between(date , LocalDate.now()).getYears();*/

        this.gender = gender.equals("male") ? "М" : "Ж";
        this.phone = phone;
    }

    /*public boolean isFull() {
        return ((firstName != null && !firstName.isEmpty()) &&
                (middleName != null && !middleName.isEmpty()) &&
                (lastName != null && !lastName.isEmpty()) &&
                (birthday != null) &&
                (gender != null && !gender.isEmpty()) &&
                (phone != null && !phone.isEmpty()));
    }*/

    //Function for debug
    public void print() {
        System.out.println("first_name: " + getFirstName());
        System.out.println("middle_name: " + getMiddleName());
        System.out.println("last_name: " +getLastName());
        System.out.println("phone: " + getPhone());
        System.out.println("birthday: " + getBirthday());
        System.out.println("gender: " + getGender());
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.birthday = (Date) dtf.parse(birthday);
    }

    public int getAge() {
        return Period.between(birthday.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now()).getYears();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender.equals("maleb  ") ? "М" : "Ж";
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
