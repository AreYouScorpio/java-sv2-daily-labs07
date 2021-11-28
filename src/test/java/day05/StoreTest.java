package day05;

import day04.Ride;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

import static day04.Courier.rides;

public class StoreTest {

    Store store = new Store();

    @Test
    void TestWriteFile(){

        Product product1 = new Product("Alma", LocalDate.of(2020,01,02), 200);
        Product product2 = new Product("Körte", LocalDate.of(2020,01,03), 400);
        Product product4 = new Product("Görögdinnye", LocalDate.of(2020,01,03), 666);
        // Product product3 = new Product("Liba", LocalDate.of(2022,01,03), 600);
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product4);
        // store.addProduct(product3);
        store.writeProduct(1, Path.of("src/main/resources/product.csv"));


        List<String> input = null;
        try {
            input = Files.readAllLines(Path.of("src/main/resources/product.csv"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
            throw new IllegalArgumentException("Olvasási hiba");
        }

        System.out.println(input);
/*
        for (String s : input) {
            String[] tmp = s.split(" ");
            input.add(new (Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2])));
        }
*/
    }
}
