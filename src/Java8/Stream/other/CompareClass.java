package Java8.Stream.other;

import java.util.*;
import java.util.stream.Collectors;

public class CompareClass {
    public static void main(String[] args) {
//    List<Integer> numbers = Arrays.asList(1 , 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//    List<Integer> evenNumbers = numbers.stream().filter(i -> i% 2 == 0).collect(Collectors.toList());
//
//   //     System.out.println(evenNumbers);
//
//        List<String> names = Arrays.asList("John" , "Anya" ," ", "lila");
//
//        Queue<String> queue = names.stream().filter(n -> !n.isEmpty()).collect(Collectors.toCollection(()-> new LinkedList<>()));
//        System.out.println(queue);

            List<String> names = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
            Queue<String> queue = names.stream()
                    .filter(n -> !n.isEmpty())
                    .collect(Collectors.toCollection(() -> new LinkedList<>()));
            System.out.println(queue); //output [Jaime, Daenerys, Tyrion]

//
//        Set<String> namesToUpperCase = new HashSet<>();
//
//        for (String name: names) {
//           String newNames = name.toUpperCase();
//           namesToUpperCase.add(newNames);
//        }
//        System.out.println(namesToUpperCase);

//        Set<String> namesToUpperCase = names.stream().map(String::toUpperCase).collect(Collectors.toSet());
//        System.out.println(namesToUpperCase);
    }
}
