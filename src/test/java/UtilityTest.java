import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;

public class UtilityTest {

    private List<Person> ppl=new ArrayList<>();
    private Utility util=new Utility();
    @Before
    public void setUp() {
        ppl.add(new Person("Mary", LocalDate.of(2010, 01, 01), Person.Sex.FEMALE, ""));
        ppl.add(new Person("Jimothy", LocalDate.of(2000, 01, 01), Person.Sex.MALE, null));
        ppl.add(new Person("Susan", LocalDate.of(2015, 01, 01), Person.Sex.FEMALE, "email"));
        ppl.add(new Person("Millard", LocalDate.of(1910, 01, 01), Person.Sex.MALE, null));
        ppl.add(new Person("Barb", LocalDate.of(1950, 01, 01), Person.Sex.FEMALE, "."));
    }

    @Test
    public void printPersonsBirthdateFilter() {
        Predicate<Person> pred = p -> p.getBirthday().compareTo(LocalDate.of(2000,01,01))<0;
        Utility.Tester tester = util.new Tester(pred);
        util.printPersons(ppl,tester);
        Integer expected = 2;
        Integer actual = util.printCounter;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void printPersonsNameFilter() {
        Predicate<Person> pred = p -> p.getName().charAt(0)=='M';
        Utility.Tester tester = util.new Tester(pred);
        util.printPersons(ppl,tester);
        Integer expected = 2;
        Integer actual = util.printCounter;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void printPersonsEmailFilter() {
        Predicate<Person> pred = p -> p.getEmailAddress()==null;
        Utility.Tester tester = util.new Tester(pred);
        util.printPersons(ppl,tester);
        Integer expected = 2;
        Integer actual = util.printCounter;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void printPersonsGenderFilter() {
        Predicate<Person> pred = p -> p.getGender().equals(Person.Sex.FEMALE);
        Utility.Tester tester = util.new Tester(pred);
        util.printPersons(ppl,tester);
        Integer expected = 3;
        Integer actual = util.printCounter;
        Assert.assertEquals(expected,actual);
    }
}