package udemy.in28minutes;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Mkyong {

    public static void main(String[] args) {

        /*
         * primeNumberStream(); primeNumberBigInteger();
         * isStringNumberOrAlphabetsOnly(); stringPatternMatcherNumberOrAlphabets();
         * stringJoining(); convertMapToList();
         */
        isStringNumberOrAlphabetsOnly();
        stringJoining();
        arrayJoiner();
        NumberUtils.isDigits("dkd");
    }

    private static void arrayJoiner() {
        // ArrayUtils.addAll

        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
        int[] int1 = new int[]{1, 2, 3};
        int[] int2 = new int[]{4, 5, 6};

        String[] addAllObjects = ArrayUtils.addAll(s1, s2);
        int[] addAllPrimitives = ArrayUtils.addAll(int1, int2);
        System.out.println(Arrays.toString(addAllObjects));
        System.out.println(Arrays.toString(addAllPrimitives));

        // java 8 stream add all objects

        String[] array = Stream.of(s1, s2).flatMap(Arrays::stream).toArray(String[]::new);
        int[] array2 = IntStream.concat(IntStream.of(int1), IntStream.of(int2)).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }

    private static void convertMapToList() {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(50, "dragonfruit");
        map.put(40, "watermelon");
        map.put(20, "orange");
        map.put(30, "banana");

        // map keys to List
        List<Integer> keys = map.keySet().stream().sorted().collect(Collectors.toList());
        keys.forEach(System.out::println);
        // map keys to List
        List<String> values = map.values().stream().sorted().collect(Collectors.toList());
        values.forEach(System.out::println);
    }

    private static void stringJoining() {
        List<String> numbers = Arrays.asList("1", "20", "A1", "333", "A2A211");
        StringJoiner sj = new StringJoiner("--", "Output : ", "... End");
        for (String string : numbers) {
            sj.add(string);
        }
        System.out.println(sj);
        System.out.println(String.join("--", numbers));
        String collect = numbers.stream().collect(Collectors.joining("--", "Output : ", "... End"));
        System.out.println(collect);
    }

    private static void stringPatternMatcherNumberOrAlphabets() {
        List<String> numbers = Arrays.asList("1", "20", "A1", "333", "A2A211");

        Pattern pattern = Pattern.compile("\\d+");
        List<String> collect = numbers.stream()
                .map(x -> new Scanner(x).findAll(pattern).map(m -> m.group()).collect(Collectors.toList()))
                .flatMap(List::stream).collect(Collectors.toList());

        collect.forEach(x -> System.out.println(x));
    }

    private static void isStringNumberOrAlphabetsOnly() {
        List<String> list = Arrays.asList("dfdf", "11", "345", "df33434", "1", "20", "A1", "333", "A2A211");
        // Regex : "\\d+" Numbers only & "\\D+" alphabets only
        list.stream().filter(x -> x.matches("\\D+")).forEach(System.out::println);
        list.stream().map(x -> x.replaceAll("\\D", "#")).forEach(System.out::println);
    }

    private static void primeNumberBigInteger() {
        List<BigInteger> collect = Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime).limit(100)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println(collect.get(0));
    }

    private static void primeNumberStream() {
        List<Integer> collect = IntStream.iterate(0, n -> n + 1).limit(100).filter(Java8Mkyong::isPrime).boxed()
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println(collect.get(0));
    }

    private static Boolean isPrime(int x) {
        return x > 1 && IntStream.rangeClosed(2, x / 2).noneMatch(i -> x % i == 0);
    }

}
