import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadFiles {

    public static void main(String[] args) throws IOException {


        // Affiche chaque mot sans les doublons grace a distinct
        Files.lines(Paths.get("file.txt"))
                .map(str -> str.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);


        
    }
}
