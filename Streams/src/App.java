import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("c", 10),
            new Movie("b", 15),
            new Movie("a", 20)
        );



        // Declarative approach
        // movies.stream()
        //     .sorted(Comparator.comparing(Movie::getLikes))
        //     .forEach(m -> System.out.println(m.getTitle()));
        

        movies.stream()
        .sorted((a, b) -> b.getLikes() - a.getLikes())
        .forEach(m -> System.out.println(m.getTitle()));
    }
}
