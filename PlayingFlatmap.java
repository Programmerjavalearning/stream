import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlayingFlatmap {



    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot","API", "Azure", "Docker", "Kubernetes");
        List<String> courses2 = List.of("Spring", "Spring Boot","API", "Azure", "Docker", "Kubernetes");

        // Séparé tout les éléments par une virgule
        System.out.println(courses.stream().collect(Collectors.joining(",")));

        // TT les caracteres dans une string
        System.out.println(courses.stream()
                .map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));

    }
}
