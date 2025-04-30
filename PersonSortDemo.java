import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonSortDemo {
        public static void main(String[] args) {
            List<Person> persons = Arrays.asList(
                    new Person("Alex", 34),
                    new Person("Artem", 33),
                    new Person("Igor", 31),
                    new Person("Ksenia", 35));


            List<Person> sortedPersons = persons.stream()
                    .sorted(Comparator.comparingInt(Person::age)
                            .thenComparing(Person::name))
                    .collect(Collectors.toList());

            sortedPersons.forEach(System.out::println);
        }
    }