package day01;

public class Human {
    int yearOfBirth;
    String name1;
    String name2;



    public Human(int year, String name1, String name2) {
        if (yearOfBirth > 120) {
            throw new IllegalArgumentException("Szül év hiba !")
            this.yearOfBirth = year;
            this.name1 = name1;
            this.name2 = name2;

        }

        public int getYear () {
            return yearOfBirth;
        }


        public String getName1 () {
            return name1;
        }

        public String getName2 () {
            return name2;
        }
    }
}