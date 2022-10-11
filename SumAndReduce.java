import java.util.List;

public class SumAndReduce {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,10,15,3,35,45,78,95);

        // Sans utiliser les streams
        int sum = addListStructured(numbers);
        System.out.println(sum);

        // Avec une méthode static dans la classe
        int sum2 = addListFunctionnal(numbers);
        System.out.println(sum2);

        // Avec une méthode reference ou lambda
        int sum3 = addListFunctionnal2(numbers);
        System.out.println(sum3);

    }

    private static int addListFunctionnal2(List<Integer> numbers) {

        return numbers.stream()
                //avec une lambda
                //.reduce(0, (x,y) -> x+y);

                //avec une methode reference
                .reduce(0, Integer::sum);

    }


    public static int sum (int a , int b){
        return a+b;
    }

    private static int addListFunctionnal(List<Integer> numbers) {
       return numbers.stream()
                .reduce(0,SumAndReduce::sum);
    }

    private static int addListStructured(List<Integer> numbers) {

        int sum = 0;
        for (int number:numbers){
            sum = sum + number;
        }


        return sum;
    }
}
