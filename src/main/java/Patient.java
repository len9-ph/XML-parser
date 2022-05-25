import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Patient {
    String firstName;
    String middleName;
    String lastName;
    Date birthday;
    boolean gender; //false - male, true - female

    public Patient() {
    }

    public Patient(String firstName, String middleName, String lastName, String birthday, String gender) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.birthday = formatter.parse(birthday);
        }catch (ParseException e){
            e.printStackTrace();
        }
        this.gender = !gender.equals("male");
        //this.gender = !Objects.equals(gender, "male");
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
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.birthday = formatter.parse(birthday);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = !gender.equals("male");
    }
}
