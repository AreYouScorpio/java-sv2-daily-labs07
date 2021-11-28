package day05;

import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    void ProductTest() {


        Product product1 = new Product("Alma", LocalDate.of(2020,01,02), 200);
        Product product2 = new Product("Körte", LocalDate.of(2020,01,03), 400);
        assertEquals("Alma",product1.getName());
    }

}
