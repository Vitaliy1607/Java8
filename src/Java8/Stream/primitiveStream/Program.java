package Java8.Stream.primitiveStream;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Program {
    public static void main(String[] args) {
        //Streams have 3 primitive Types 1)instStream 2)LongStream 3) DoubleStream

        //<-------------------------------------------------------->
        // a)Creating primitive using  .of()

        IntStream intStream = IntStream.of(1 , 2 ,3 ,4);
        LongStream longStream = LongStream.of(5, 6 ,7 ,8);
        DoubleStream doubleStream = DoubleStream.of(9, 19, 11 ,12);

        //<--------------------------------------------------------->
        // b)Creating primitive using range

        IntStream intStream1 = IntStream.range(1, 100); //Generate stream in this diapason
        LongStream longStream1 = LongStream.range(2 , 200);
        // DoubleStream doubleStream1 = DoubleStream.range(3,300);  // DoubleStream don`t have this method

        //<---------------------------------------------------------->

        // c)asIntStream , asLongStream, asDoubleStream
        //IntStream can be convert to LongStream, or DoubleStream. LongStream only DoubleStream. DoubleStream don`t convert back

        DoubleStream doubleStream1 = IntStream.range(2, 200).asLongStream().asDoubleStream();

        // <------------------------------------------------------------>

        // d)toArray
        // All primitive Streams can convert to array of primitives

        int[] ints = IntStream.of(1,2).toArray(); // [1, 2]
        long[] longs = LongStream.of(3, 4).toArray(); // [3, 4]
        double[] doubles = DoubleStream.of(5, 6).toArray(); // [5.0, 6.0]

        // <------------------------------------------------------------>
                            // TERMINAL OPERATION
        // d)Sum
        int intSum = IntStream.of(1, 2).sum(); // 3
        long longSum = LongStream.of(3, 4).sum(); // 7
        double doubleSum = DoubleStream.of(5, 6).sum(); // 11

        // <------------------------------------------------------------>

        // e)Average
        //Need to know average method return OPTIONALDOUBLE(wrapper of double), -> but don`t this value of double

        OptionalDouble intAverage = IntStream.of(1, 2).average(); // 1.5
        OptionalDouble longAverage = LongStream.of(3, 4).average(); // 3.5
        OptionalDouble doubleAverage = DoubleStream.of(5, 6).average(); // 5.5

        // <------------------------------------------------------------>

        // e)forEach
        IntStream.of(1, 3, 5, 7, 9)
                .filter((i) -> i > 3)
                .forEach(System.out::println); //output 5 7 9

    }
}
