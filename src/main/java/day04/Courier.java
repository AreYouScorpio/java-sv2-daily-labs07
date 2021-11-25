package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    public static List<Ride> rides = new ArrayList<>();

    public void addRide(Ride newRide) {
        if (newRide.getDay() > rides.get(rides.size() - 1).getDay() && newRide.getRideNumberThisDay()>rides.get(rides.size()-1).getRideNumberThisDay() ) {
            rides.add(newRide);
        } else {
            throw new IllegalArgumentException("Nem vihető fel utólag korábbi adat.");
        } ;

    }

}
