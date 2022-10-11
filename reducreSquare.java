import java.util.List;

public class reducreSquare {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,10,15,3,35,45,78,95);

      int square =  numbers.stream()
                .map(x -> x*x)
                .reduce(0, Integer::sum);
        System.out.println(square);

        int cube =  numbers.stream()
                .map(x -> x*x*x)
                .reduce(0, Integer::sum);
        System.out.println(cube);

        int odd =  numbers.stream()
                .filter(x -> x % 2 == 1)
                .reduce(0, Integer::sum);

        System.out.println(odd);



    }
}
