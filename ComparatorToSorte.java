import java.util.Comparator;
import java.util.List;

public class ComparatorToSorte {

    public static void main(String[] args) {
        List<String> courses = List.of("Math", "Anglais","Francais","Histoire","Programmation","Sport","Géographie","Espagnol");
        
        
        // Affiche par ordre alpha
        courses.stream()
                .sorted(Comparator.naturalOrder()).forEach(System.out::println);

        System.out.println("//////////////////////////////");

        // Affiche l'inverse de l'ordre alpha
        courses.stream()
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        System.out.println("//////////////////////////////");
        
        
        // Affiche par ordre alpha + taille des strings
        courses.stream()
                .sorted(Comparator.comparing(x -> x.length())).forEach(System.out::println);
        
    }
}
