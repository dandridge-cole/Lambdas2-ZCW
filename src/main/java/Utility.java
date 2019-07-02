import java.util.function.Predicate;

public class Utility {

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
}
