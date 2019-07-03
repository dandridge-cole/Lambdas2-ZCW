import java.util.List;
import java.util.function.Predicate;

public class Utility {

    Integer printCounter;

    public Utility() {
        this.printCounter = 0;
    }

    public void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
                this.printCounter++;
            }
        }
    }
}
