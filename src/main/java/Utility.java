import java.util.List;
import java.util.function.Predicate;

public class Utility {

    Integer printCounter;

    public Utility() {
        this.printCounter = 0;
    }

    public class Tester implements CheckPerson{
        Predicate<Person> predicate;

        public Tester(Predicate<Person> predicate) {
            this.predicate = predicate;
        }


        @Override
        public boolean test(Person p) {
            return predicate.test(p);
        }
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
