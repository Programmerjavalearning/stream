import java.util.List;
import java.util.stream.Collectors;

public class CollectStream {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,10,15,3,35,45,78,95);

        List<String> courses = List.of("Math", "Anglais","Francais","Histoire","Programmation","Sport","Géographie","Espagnol");

        // Le carée des numbers
        List <Integer> numberSquared = doubleNumbersList(numbers);
        System.out.println(numberSquared);

        System.out.println("////////////////////////////////");

        // Seulement les chiffres pairs
        List <Integer> evenNumber = evenNumberList(numbers);
        System.out.println(evenNumber);
        System.out.println("////////////////////////////////");


        // La taille des cours
        List <Integer> lengthOfCourses = lengthOfCourses(courses);
        System.out.println(lengthOfCourses);





    }

    private static List<Integer> lengthOfCourses(List<String> courses) {

        return courses.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());


    }

    private static List<Integer> evenNumberList(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList());
    }

    private static List<Integer> doubleNumbersList(List<Integer> numbers) {

        return numbers.stream()
                .map(number -> number * number )
                .collect(Collectors.toList());

    }
}
