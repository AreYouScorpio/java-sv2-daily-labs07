package day05;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
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

    public void writeProduct(int month, Path path){
        try{
            StringBuilder sb = new StringBuilder();
            List<String> productListToWrite = new ArrayList<>();
            for (Product p : products) {
                if (p.getSellingDate().getMonth().getValue()==month) sb.append(p.getName()).append(";").append(p.getSellingDate()).append(";").append(p.getPrice()).append("\n");
            }
            productListToWrite.add(sb.toString());
            System.out.println(sb);
            System.out.println(productListToWrite.toString());

            Files.write(path, productListToWrite);
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        throw new IllegalStateException("File írási hiba.", ioe);}
    }

}
