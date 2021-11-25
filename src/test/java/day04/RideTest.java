package day04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RideTest {



    @Test
    void rideTest(){
    Ride ride = new Ride(5,4,3);
    assertEquals(5, ride.getDay());
    assertEquals(4, ride.getRideNumberThisDay());
    assertEquals(3, ride.getKm());
    }
}
