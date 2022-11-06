package homework14;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Float> salary = (amount) -> amount > 1500.0;

        Consumer<String> stringToCharArray = (string) -> System.out.println(Arrays.toString(string.toCharArray()));
        stringToCharArray.accept("12345");

        List<String> strings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");
        Function<Integer, String> intValueToString = (value) -> {
            if (value > strings.size() || value <= 0) {
                return "unknown";
            }
            return strings.get(value - 1);

        };
        System.out.println("intValueToString: " + intValueToString.apply(5));

        Supplier<String> stringSupplier = () -> strings.get((int) (Math.random() * 10));
        System.out.println("stringSupplier: " + stringSupplier.get());

        BiFunction<Float, Integer, String> floatMinusInteger = (aFloat, integer) -> {
            if (aFloat - integer >= 1) {
                return String.valueOf(aFloat - integer);
            }
            return "value less than one";
        };
        MathOperation<Integer, Float, Double, Byte, Long> calculator = (aFloat, aDouble, aByte, aLong) ->
                (int) (aDouble * aLong + aByte - aByte);

        IntConsumer intConsumer = (value -> System.out.println(value + value * 3));
        intConsumer.accept(12);
    }
}
