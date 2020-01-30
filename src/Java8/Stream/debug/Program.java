package Java8.Stream.debug;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1 , 2 ,3 , 5 , 7);

        numbers.stream().peek(System.out::println).forEach(Program::doSomeStaff);

        numbers.stream().peek(Program::debug).forEach(Program::doSomeStaff);
    }

    private static void doSomeStaff(Integer n){

    };

    private static void debug(Integer n){
        System.out.println(n);
    }

}

