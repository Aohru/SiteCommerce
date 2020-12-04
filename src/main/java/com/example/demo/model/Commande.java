package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "COMMANDE")
public class Commande {
    @Id
    @GeneratedValue
    @JsonProperty("IdCommande")
    private int idCommande;

    @ManyToOne
    @JoinTable( name = "Commandes_Clients",
            joinColumns = @JoinColumn( name = "IdCommande" ),
            inverseJoinColumns = @JoinColumn( name = "IdClient" ) )
    protected Client client;
}
