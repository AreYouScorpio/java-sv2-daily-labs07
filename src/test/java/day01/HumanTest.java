package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HumanTest {

    @Test
    void createHumanWithWrongYear(){
        // Human h = new Human(1900, "John Doe");
        assertThrows(IllegalArgumentException.class,()-> new Human(1900, "John Doe"));
    }

}
