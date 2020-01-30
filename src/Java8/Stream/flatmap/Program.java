package Java8.Stream.flatmap;

import Java8.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Program {
    public static void main(String[] args) {
        List<Human> humans = asList(new Human("Ivan", asList("bobik","topik")),
                new Human("Orest", asList("lucky", "vikont")),
                new Human("John",asList("norb", "korgi")));

        // It`s a code before Java8 without flatMap
        List<String> pets1 = new ArrayList<>();
        for (Human human: humans){
            pets1.addAll(human.getPets());
        }
        System.out.println(pets1);

        // <----------------------------------------------------------------------------------------->

        // It`s a code example with map and flatmap
        // where we first get List using map()
        // and after use flatMap() for return Stream

        List<String> pets2= humans.stream()
            .map(human -> human.getPets())
            .flatMap(pet -> pet.stream())
            .collect(Collectors.toList());


        System.out.println(pets2);


        // <-------------------------------------------------------------------------------------------->

    //Or we can use shortest code without using map()

        List<String> pets3 = humans.stream()
                .flatMap(human -> human.getPets().stream())
                .collect(Collectors.toList());

        System.out.println(pets3);
    }
}
