package day04;

public class Ride {
    private  int day;
    private  int rideNumberThisDay;
    private  int km;

    public Ride(int day, int rideNumberThisDay, int km) {
        this.day = day;
        this.rideNumberThisDay = rideNumberThisDay;
        this.km = km;
    }

    public int getDay() {
        return day;
    }

    public int getRideNumberThisDay() {
        return rideNumberThisDay;
    }

    public int getKm() {
        return km;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "day=" + day +
                ", rideNumberThisDay=" + rideNumberThisDay +
                ", km=" + km +
                '}';
    }
}
