package com.example.demo;

import com.example.demo.repository.ProduitRepository;
import com.example.demo.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements ApplicationRunner {

    private ProduitRepository produitRepository;

    @Autowired
    public DataInit(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = produitRepository.count();

        if (count == 0) {
            Produit p1 = new Produit();

            p1.setNom("Croquette Royal canin 1kg");
            p1.setPrix(100);
            p1.setCatégorie("Nourriture");
            //
            Produit p2 = new Produit();

            p2.setNom("PC");
            p2.setPrix(300);
            p2.setCatégorie("Informatique");

            produitRepository.save(p1);
            produitRepository.save(p2);
        }


    }

}