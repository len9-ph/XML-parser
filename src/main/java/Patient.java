import java.text.ParseException;
import java.text.SimpleDateFormat;
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

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.birthday = formatter.parse(birthday);
        }catch (ParseException e){
            e.printStackTrace();
        }
        this.gender = gender;
        //this.gender = !Objects.equals(gender, "male");
        this.phone = phone;
    }

    public boolean isFull() {
        return ((firstName != null && !firstName.isEmpty()) &&
                (middleName != null && !middleName.isEmpty()) &&
                (lastName != null && !lastName.isEmpty()) &&
                (birthday != null) &&
                (gender != null && !gender.isEmpty()) &&
                (phone != null && !phone.isEmpty()));
    }

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
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.birthday = formatter.parse(birthday);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
