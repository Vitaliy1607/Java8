package Java8.Stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1 , 2 , 3 , 5);

        // Optional because we don`t assign start value(10 for example)
        Optional<Integer> nums = numbers.stream().reduce((left, right) -> left + right);
        System.out.println(nums);

        /* operation start from 10
        Algorithm --
         1) acc = 0 element =1 -first element in 'numbers' - 0+1 = 1
         2)acc = 1 element = 2 -second element in 'numbers' List = 1 + 2 = 3 and acc = 3
         and continue this operation while don`t ending numbers*/
        Integer sums = numbers.stream().reduce(10 , (acc, element) -> acc + element);
        System.out.println(sums);

        List<Integer> multipleNums = Arrays.asList(1, 2 ,3);

        // 1 * 10, 2*10 , 3* 10
        //First multiple array and that plus this values
        Integer multipleSum = multipleNums.stream().reduce(10, (acc, element)-> acc * element, (left,right)->left + right);
        System.out.println(multipleSum);

        //Min and MAX value
        List<Integer> minValue = Arrays.asList(2 , 5 ,7 , 8);

        Integer min = minValue.stream().reduce(Integer.MAX_VALUE, (left, right) -> left < right ? left : right);
        Integer minShort = minValue.stream().reduce(Integer.MAX_VALUE, Integer::min);

        System.out.println(min);
        System.out.println(minShort);
    }
}
