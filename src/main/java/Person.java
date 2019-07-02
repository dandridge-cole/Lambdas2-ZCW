import java.time.LocalDate;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;

    public Person() {
        this.name = "name";
        this.birthday=LocalDate.MAX;
        this.gender=Sex.MALE;
        this.emailAddress="email";
    }

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    LocalDate getBirthday() {
        return birthday;
    }

    void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    Sex getGender() {
        return gender;
    }

    void setGender(Sex gender) {
        this.gender = gender;
    }

    String getEmailAddress() {
        return emailAddress;
    }

    void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void printPerson() {
        System.out.println(String.format("Name: %s\nBirthdate: %s\nSex: %s\nE-mail: %s"
                ,this.getName()
                ,this.getBirthday()
                ,this.getGender()
                ,this.getEmailAddress()));
    }

    //inner classes that implement the CheckPerson interface, but override the test method.
    //Abstract class, passed as parameter to printPoeple method, can create a new instance of the abstract class (of type "CheckPerson") as a paramenter to a call to the printPeople method
    // a lambda exmplression that takes in the same parameter and returns the expected type as the one method of the Interface can be passed as the parameter in place of the abstract class
    // p -> p.getName().equals(nameToMattch);
}
