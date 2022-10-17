import java.util.Arrays;
import java.util.stream.Stream;

public class FunctionalProgramming {

    public static void main(String[] args) {

        System.out.println( Stream.of(12,9,10,4,6,3,4,14,15).count());

        System.out.println( Stream.of(12,9,10,4,6,3,4,14,15).reduce(0,Integer::sum));

        int [] numberArray = {12,9,10,4,6,3,4,14,15};


        System.out.println(Arrays.stream(numberArray).sum());

        System.out.println(Arrays.stream(numberArray).average());

    }
}
