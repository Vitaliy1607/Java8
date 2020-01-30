package Java8.Stream.limitAndSkip;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1 , 2 , 3 ,4 ,5 ,6 ,7 ,8);

        nums.stream().skip(10).forEach(System.out::println);
        //if n > nums.length -> get empty array '[]'
        // if n = (-n) -> get IllegalArgumentException
        nums.stream().limit(4).forEach(System.out::println);
    }
}
