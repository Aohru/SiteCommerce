package com.example.demo.repository;

import com.example.demo.model.Produit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProduitRepository extends CrudRepository<Produit, Long> {
    public List<Produit> findAll(); // select * from produit
    public Produit findById(int id);
    public Produit save(Produit product); // INSERT into produit
    public List<Produit> findByCatégorie(String catégorie);
    public Produit deleteById(int idProduit);
    public List<Produit> findAllByOrderByPrixDesc();
    public List<Produit> findAllByOrderByPrixAsc();
}
