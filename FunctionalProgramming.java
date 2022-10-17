import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalProgramming {

    public static void main(String[] args) {

        System.out.println( Stream.of(12,9,10,4,6,3,4,14,15).count());

        System.out.println( Stream.of(12,9,10,4,6,3,4,14,15).reduce(0,Integer::sum));

        int [] numberArray = {12,9,10,4,6,3,4,14,15};


        System.out.println(Arrays.stream(numberArray).sum());

        System.out.println(Arrays.stream(numberArray).average());

        // Stream de 1 à 9
        System.out.println(IntStream.range(1,10).sum());
        // Stream de 1 à 10
        System.out.println(IntStream.rangeClosed(1,10));

        System.out.println(IntStream.rangeClosed(1,10).sum());


        //Créé une stream de 10 éléments qui commence à 1 et incrémente de +2 chaque élément
        System.out.println(IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum());


        System.out.println(IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum());

        // Le cube de chaque éléments
        System.out.println(IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum());













    }
}
