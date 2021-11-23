package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {

    @Test
    void testFillMovies(){
        MovieService movieService = new MovieService(Path.of("src/test/resources/movies.csv"));

        assertEquals(5,movieService.getMovies().size());
        assertEquals("James Cameron", movieService.getMovies().get(1).getDirector());

    }

    @Test
    void testFillMoviesFileNotFound(){
        IllegalArgumentException ise = assertThrows(IllegalArgumentException.class, ()-> new MovieService(Path.of("movies.txt")));
        assertEquals("Cannot read file", ise.getMessage());
        assertEquals(NoSuchFileException.class, ise.getCause().getClass());
    }
}
