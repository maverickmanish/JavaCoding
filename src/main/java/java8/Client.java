package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Client {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("kb");
        p1.setDesignation("se");
        p1.setAge(26);

        Person p2 = new Person();
        p2.setName("hani");
        p2.setDesignation("se");
        p2.setAge(28);

        List<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        System.out.println("people before sorting");
        System.out.println(people);
        // Collections.sort(people,new PersonComparator());
        Collections.sort(people, (a, b) -> {
            return a.getName().compareTo(b.getName());
        });
        System.out.println("people after sorting");
        System.out.println(people);

        /* An example to use Math.max() which is static method. */

        System.out.println("An example to use Math.max() which is static method.");
        List<Integer> integers = Arrays.asList(1, 12, 433, 5);

        Optional<Integer> max = integers.stream().reduce(Math::max);
        max.ifPresent(System.out::println);

        /*
         * In this example, s1.compareTo(s2) is referred as String::compareTo.
         */
        System.out.println("In this example, s1.compareTo(s2) is referred as String::compareTo.");
        List<String> strings = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");

        List<String> sorted = strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());

        System.out.println("sorted one now" + sorted);

        List<String> sortedAlt = strings.stream().sorted(String::compareTo).collect(Collectors.toList());

        sortedAlt.forEach(System.out::println);
        System.out.println(sortedAlt);

        List<String> string = Arrays.asList("this", "is", "going", "to", "performance", "based", "reduce", "mapping");

        List<String> sortedString = string.stream().sorted(String::compareTo).collect(Collectors.toList());

        System.out.println(sortedString);


        System.out.println("use of constructor calling using method reference ");

        List<Integer> integersRange = IntStream
                .range(1, 100)
                .boxed()
                .collect(Collectors.toList());

        Optional<Integer> maxOfange = integersRange.stream().reduce(Math::max);

        maxOfange.ifPresent(System.out::println);


    }
}