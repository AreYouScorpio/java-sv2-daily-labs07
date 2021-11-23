package day02;

import java.io.IOException;
import java.nio.file.Path;

public class MovieMain {
    public static void main(String[] args)  throws IOException {
        MovieService movieService = new MovieService(Path.of("src/main/resources/movies.csv") );
        for (int i=0; i<movieService.getMovies().size(); i++){
            System.out.println(movieService.getMovies().get(i).getTitle());
        }
    }
}