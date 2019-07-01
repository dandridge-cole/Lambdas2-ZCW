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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void printPerson() {
        System.out.println(String.format("Name: %s\nBirthdate: %s\nSex: %s\nE-mail: %s"
                ,this.getName()
                ,this.getBirthday()
                ,this.getGender()
                ,this.getEmailAddress()));
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    //inner classes that implement the CheckPerson interface, but override the test method.
    //Abstract class, passed as parameter to printPoeple method, can create a new instance of the abstract class (of type "CheckPerson") as a paramenter to a call to the printPeople method
    // a lambda exmplression that takes in the same parameter and returns the expected type as the one method of the Interface can be passed as the parameter in place of the abstract class
    // p -> p.getName().equals(nameToMattch);
}
