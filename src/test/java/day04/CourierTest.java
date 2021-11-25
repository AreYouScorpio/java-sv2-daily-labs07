package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static day04.Courier.addRide;
import static day04.Courier.rides;
import static day04.CourierFileManager.createCourierByFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CourierTest {

    @Test
    void addRideTestOK(){
        createCourierByFile(Path.of("src/main/resources/courier.txt"));
        addRide(new Ride(5,5,5));
        System.out.println(rides);
        assertEquals(7, rides.size());
    }
    @Test
    void addRideTestNOK(){
        createCourierByFile(Path.of("src/main/resources/courier.txt"));
        // addRide(new Ride(1,5,5));
        // System.out.println(rides);
        // assertEquals(6, rides.size());


        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> addRide(new Ride(1,5,5)));
        assertEquals("Nem vihető fel utólag korábbi adat.", exception.getMessage());

    }



}
