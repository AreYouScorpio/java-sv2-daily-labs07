package day04;

import day02.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static day04.Courier.addRide;
import static day04.Courier.rides;

public class CourierFileManager {
    static Courier courier = new Courier();


    public static void createCourierByFile(Path path) {
        List<String> input = null;
        try {
            input = Files.readAllLines(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            throw new IllegalArgumentException("Olvasási hiba");
        }

        System.out.println(input);

        for (String s : input) {
            String[] tmp = s.split(" ");
            rides.add(new Ride(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2])));
        }

        System.out.println(rides);
    }

    public static void main(String[] args) {
        CourierFileManager courierFileManager = new CourierFileManager();
        createCourierByFile(Path.of("src/main/resources/courier.txt"));
        addRide((new Ride(4,4,5)));
        System.out.println(rides);

    }

}
