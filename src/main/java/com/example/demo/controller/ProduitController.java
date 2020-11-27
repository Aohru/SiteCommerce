package com.example.demo.controller;

import com.example.demo.repository.ProduitRepository;
import com.example.demo.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProduitController {



    @Autowired
    private ProduitRepository produitRepository;

    @Value("${error.message}")
    private String errorMessage;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @GetMapping(value = "/prod")
    public String afficherlisteProduits(Model model) {
        model.addAttribute("produits", this.produitRepository.findAll());
        return "produits";
    }

    @GetMapping(value = "/prod/catégorie/{catégorie}")
    public String afficherProduitsParCatégories(@PathVariable String catégorie, Model model) {
        model.addAttribute("produits", this.produitRepository.findByCatégorie(catégorie));
        return "produits";
    }

    @GetMapping(value = "/prod/id/{id}")
    public String afficherUnProduit(@PathVariable int id, Model model) {
        model.addAttribute("produits", this.produitRepository.findById(id));
        return "produits";
    }

    @GetMapping(value = {"/ajouter"})
    public String afficherAjouterProduit(Model model) {
        model.addAttribute("produit", new Produit());
        return "ajouter";
    }

    @PostMapping(value = {"/ajouter"})
    public String ajouterProduit(@ModelAttribute Produit produit) {
        produitRepository.save(produit);
        return "index";
    }
}
