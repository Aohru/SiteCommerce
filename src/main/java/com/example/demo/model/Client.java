package com.example.demo.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Nom", length = 64, nullable = false)
    private String nom;

    @Column(name = "Prénom", nullable = false)
    private String prénom;

    @Column(name = "Mail", nullable = false)
    private String mail;

    @Column(name = "Adresse", nullable = false)
    private String adresse;

    @Column(name = "Age", nullable = false)
    private int age;

    @Column(name = "Type", nullable = false)
    private String type;

    @OneToMany
    @JoinTable( name = "Commandes_Clients",
            joinColumns = @JoinColumn( name = "IdClient" ),
            inverseJoinColumns = @JoinColumn( name = "IdCommande" ) )
    private List<Commande> commandes = new ArrayList<>();


    public Client() {
    }

    public Client(int id, String nom, String prénom, String mail, String adresse, int age, String type) {
        this.id = id;
        this.nom = nom;
        this.prénom = prénom;
        this.mail = mail;
        this.adresse = adresse;
        this.age = age;
        this.type = type;
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

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
