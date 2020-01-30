package Java8.Stream.distinctStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program{
    public static void main(String[] args) {
        //Use distinct() method for choose unique elements realize equals
        // if class nor realize equals method don`t have a sense

        List<String> strings = Arrays.asList("a", "b", "c" , "d", "a" , "b");
        strings.stream().distinct().forEach(System.out::println);

        //Use sorted() stream to get sorted list we can use Comparator

        List<Person> people = Arrays.asList(
                new Person("Ivan"),
                new Person("Orest"),
                new Person("Misha"));


        // standart or reversed sorting
        people.stream().sorted(Comparator.comparing(Person::getName).reversed()).forEach(System.out::println);

        // we can use parallel and parallelStream() for execute task in fer thread
        people.stream().parallel().forEach(System.out::println);
        people.parallelStream().forEach(System.out::println);

        //Sequential stream its a standart stream but with this we can return basic stream form parallel

        people.parallelStream().sequential().forEach(System.out::println);
    }

}
