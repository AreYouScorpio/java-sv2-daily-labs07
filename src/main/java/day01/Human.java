package day01;

import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    private String name;




    public Human(int year, String name) {
        NameValidator nv = new NameValidator();
        YearOfBirthValidator yobv = new YearOfBirthValidator();

        if (yobv.isYearOfBirthValid(yearOfBirth) && nv.isNameValid(name)) {
            this.yearOfBirth = year;
            this.name = name;
        }
    }






    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }
}