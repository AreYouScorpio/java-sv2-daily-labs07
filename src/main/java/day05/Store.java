package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Store {
    public static List<Product> products = new ArrayList<>();

    public void addProduct (Product p){
        LocalDate today = LocalDate.now();
        if (!p.sellingDate.isAfter(today)) {
            products.add(p);
        }
        else throw new IllegalArgumentException("Rossz dátum.");
    }

    public void writeProduct (int month, Path path){
        try{
            List<String> readable = new ArrayList<>();
            for (Product p : products) {
                if (p.getSellingDate().getMonth().getValue()==month) readable.add(p.getName()+";"+p.getSellingDate()+";"+p.getPrice());
            }
                Files.write(path, readable);
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        throw new IllegalStateException("File írási hiba.", ioe);}
    }

}
