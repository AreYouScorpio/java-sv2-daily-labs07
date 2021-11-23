package day02;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    public static void main(String[] args) {
        Movie movie = new Movie();
    try{
        readFilms("movies.csv");
        System.out.println(filmek);
    }
    catch (IOException ioe){
        System.out.println("Cannot read file");
        ioe.printStackTrace();
    }

    }
}
