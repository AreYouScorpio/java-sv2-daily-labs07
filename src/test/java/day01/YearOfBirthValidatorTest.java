package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearOfBirthValidatorTest {

    YearOfBirthValidator yearOfBirthValidator = new YearOfBirthValidator();

    @Test
    void isYearOfBirthValidTest(){

        assertTrue(YearOfBirthValidator.isYearOfBirthValid(1901));
    }

    @Test
    void isYearOfBirthValidWithWrongParamTest(){
        // System.out.println(IllegalArgumentException.class.toString());   ezt írja ki:  class java.lang.IllegalArgumentException
        assertThrows(IllegalArgumentException.class, ()-> yearOfBirthValidator.isYearOfBirthValid(1900));
    }


}