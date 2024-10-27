import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("c", 10),
            new Movie("b", 15),
            new Movie("a", 20),
            new Movie("d", 10)
        );

        // Declarative approach
        // movies.stream()
        //     .sorted(Comparator.comparing(Movie::getLikes))
        //     .forEach(m -> System.out.println(m.getTitle()));
    
        // movies.stream()
        // .sorted((a, b) -> b.getLikes() - a.getLikes())
        // .forEach(m -> System.out.println(m.getTitle()));

        // movies.stream()
        // .filter(m -> m.getLikes() > 10)
        // .peek(m -> System.out.println("filtered: " + m.getTitle()))
        // .map(Movie::getTitle)
        // .peek(title -> System.out.println("mapped: " + title))
        // .forEach(System.out::println);

        // var result = movies.stream()
		// 	.max(Comparator.comparing(Movie::getTitle).reversed())
		// 	.get();
        // System.out.println(result.getTitle());
        

        Integer sum = movies.stream()
            .map(Movie::getLikes)
            .reduce(0, Integer::sum);
            // .reduce((a, b) -> a + b) is the equivalent here
        System.out.println(sum);
    }
}
