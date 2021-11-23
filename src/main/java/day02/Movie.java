package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Movie {
    private String title;
    private int year;
    private String author;

    public Movie(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    private List<String> readFilms(){
        try {
            return Files.readAllLines(Paths.get("movies.csv"));
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file.", ioe);
        }
    }
}
