package homework15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Object> empty = Stream.empty();
        empty
                .distinct()
                .limit(0)
                .forEach(System.out::println);

        Integer[] integers = {110, 25, 34, 12, 0, 3};
        Integer[] integersStream = Arrays.asList(integers)
                .stream()
                .sorted()
                .filter(element -> element > 15)
                .toArray(Integer[]::new);

        List<Integer> collect = Arrays
                .stream(integersStream)
                .collect(Collectors.toList());

        HashMap<Integer, String> integerCastToStringHashMap = new HashMap<>();
        integerCastToStringHashMap.put(1,"one");
        integerCastToStringHashMap.put(2,"two");
        integerCastToStringHashMap.put(3,"three");

        List<String> mapStream = integerCastToStringHashMap.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        mapStream.forEach(System.out::println);

        String[] strings = {"1","2","3","4","5","6","7","8","9","10"};
        Set<Integer> stringsSet = Arrays.asList(strings)
                .stream()
                .skip(1)
                .limit(8)
                .map(Integer::parseInt)
                .filter(e -> e > 0)
                .collect(Collectors.toSet());


        Optional<Integer> firstInt = Stream.of(integers)
                .parallel()
                .sorted()
                .filter(integer -> integer > 4)
                .findFirst();


        List<User> userList = Arrays.stream(strings)
                .map(String::toUpperCase)
                .map(Integer::parseInt)
                .map(Integer::shortValue)
                .map(User::new)
                .collect(Collectors.toList());

    }
}
