import java.util.List;

public class SorteAndDistinct {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,10,15,3,35,3,45,78,9,95);

        // Affiche que les numéro en retirant les doublons

        numbers.stream()
                .distinct().forEach(System.out::println);

        // Tri mais avec les doublons
        numbers.stream()
                .sorted().forEach(System.out::println);


        //Tri sans les doublons
        numbers.stream()
                .distinct()
                .sorted().forEach(System.out::println);


    }




}
