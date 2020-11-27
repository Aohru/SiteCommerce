package com.example.demo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "PRODUIT")
public class Produit {
    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Nom", length = 64, nullable = false)
    private String nom;


    @Column(name = "Prix", nullable = false)
    private int prix;

    @Column(name = "Catégorie", nullable = false)
    private String catégorie;

    public Produit() {

    }

    public Produit(int id, String nom, int prix, String catégorie) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.catégorie = catégorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(String catégorie) {
        this.catégorie = catégorie;
    }
}
