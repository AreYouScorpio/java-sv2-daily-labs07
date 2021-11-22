package day01;

import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    private String name;


    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public String getName () {
        return name;
    }

    public Human(int year, String name) {
        if (Math.abs(LocalDate.now().getYear() - yearOfBirth) <= 120 && name != null && name.indexOf(" ") > 0) {
            this.yearOfBirth = year;
            this.name = name;
        } else {
            throw new IllegalArgumentException("Szül év hiba !");
        }
    }





    }