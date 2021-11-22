package day01;

import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    private String name;




    public Human(int year, String name) {
        if (isYearOfBirthValid(yearOfBirth) && isNameValid(name)) {
            this.yearOfBirth = year;
            this.name = name;
        }
    }


    private boolean isYearOfBirthValid(int yearOfBirth){
        if(LocalDate.now().getYear()-yearOfBirth>120){
            throw new IllegalArgumentException("Invalid year!");
        }
        return true;
    }

    private boolean isNameValid(String name)
    {
       if (!(name != null && name.indexOf(" ") > 0)) {
           throw new IllegalArgumentException("Name is invalid.")
       }
       return true;
    };

    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public String getName () {
        return name;
    }


    }