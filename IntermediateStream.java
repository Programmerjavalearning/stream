import java.util.List;

public class IntermediateStream {

    public static void main(String[] args) {


        List<String> courses = List.of("Spring", "Spring Boot","API", "Azure", "Docker","Microservices", "Kubernetes");
        // Executé seulement si il y a un instruction de fin
        courses.stream().peek(System.out::println).filter(course -> course.length() > 11).map(String::toUpperCase)
                .peek(System.out::println).findFirst();






    }

}
