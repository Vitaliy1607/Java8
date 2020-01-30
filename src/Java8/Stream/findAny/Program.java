package Java8.Stream.findAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(121 , 132 , 143, 154 ,165, 176, 187);

        Optional<Integer> specInt = integers.stream().filter(n -> n.equals(132)).findAny();

        System.out.println(specInt);

        List<String> strings = Arrays.asList("Hello" , "World" , "I" , "Code" , "Java", "Java8");

        Optional<String> stringOptional = strings.stream().filter(s -> s.contains("Java")).findAny();
        System.out.println(stringOptional);

        // Our we can use parallel stream and result each time can be different

        List<String> strings2 = Arrays.asList("Hello" , "World" , "I" , "Code" , "Java", "Java8");

        Optional<String> stringOptional2 = strings2.parallelStream().filter(s -> s.contains("Java")).findAny();
        System.out.println(stringOptional2);

        // And use method findFirst() for search first result

        List<Integer> nums = Arrays.asList( 1, 3 ,6 , 8 ,10, 12, 15);

        Optional<Integer> optionalInteger = nums.stream().filter(n -> n > 11).findFirst();

        System.out.println(optionalInteger);
    }
}
