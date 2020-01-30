package Java8.Stream.Match;

import java.util.Arrays;
import java.util.List;

/* In this program i test three match() methods:  (anyMatch() , allMatch(), and NoneMatch())
* its a boolean and return true or false */
public class Program {
    public static void main(String[] args) {
        // <------------------------------------------------------------->
        // anyMatch() method return true if any of special condition is true
        List<Integer> integers = Arrays.asList( 1 , 2 , 3);

        boolean anyMatch = integers.stream().anyMatch(integer -> integer % 2 == 0);
        System.out.println(anyMatch); // return true because int '2' % 2 = 0

        // <------------------------------------------------------------->


        // <------------------------------------------------------------->
        // allMatch() method return true if all of special condition is true
        boolean allMatch = integers.stream().allMatch(integer -> integer % 2 == 0);
        System.out.println(allMatch); // return false because int '1' and '3' % 2 != 0

        // <------------------------------------------------------------->

        // <------------------------------------------------------------->
        // noneMatch() method return true if all of special condition is incorrect

        boolean noneMatch = integers.stream().noneMatch(integer -> integer % 2 == 0);
        System.out.println(noneMatch); // return false because int '2' % 2 = 0

        // <------------------------------------------------------------->

    }
}
