package day02;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public MovieService(Path path) {
        // beolvas
        try {
            List<String> lines = Files.readAllLines(path);
            fillListWithMovies(lines); // darabolas
        } catch (IOException ioe) {
            // System.out.println(ioe.getMessage());
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    private void fillListWithMovies(List<String> lines) {
    for (String s : lines) {
        String[] tmp = s.split(";");
        movies.add(new Movie(tmp[0], Integer.parseInt(tmp[1]), tmp[2])); // raktaroz

    }

    }

    public List<Movie> getMovies() {
        return movies;
    }
}
