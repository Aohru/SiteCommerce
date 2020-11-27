package com.example.demo;

import com.example.demo.model.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static Produit p1 = new Produit(5,"téléphone",4,"informatique");

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
