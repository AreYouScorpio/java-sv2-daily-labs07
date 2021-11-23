package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Movie {
    private String title;
    private int year;
    private String director;

    public Movie(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.director = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }


    }
