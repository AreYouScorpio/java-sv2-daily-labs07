package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HumanTest {

    @Test
    void createHumanWithWrongYear(){
        // Human h = new Human(1900, "John Doe");
        assertThrows(IllegalArgumentException.class,()-> new Human(1900, "John Doe"));
    }
/*
    @Test
    void HumanTestOK(){
        Human human = new Human(1976, "John Doe");
        assertEquals("John Doe", human.getName());
        assertEquals(1976, human.getYearOfBirth());
    }
*/

    /*
    @Test
    void HumanTestNOK(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> new Human(1976, "John Doe")); //elég a new-tól, m már a létrehozás hibát dob
        assertEquals("We need both surename and firstname.", exception.getMessage());
    }
     */

}

