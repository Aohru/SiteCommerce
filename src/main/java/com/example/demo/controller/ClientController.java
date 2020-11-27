package com.example.demo.controller;

import com.example.demo.repository.ClientRepository;
import com.example.demo.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(value = {"/inscription"})
    public String afficherInscriptionClient(Model model) {
        model.addAttribute("client", new Client());
        return null;
    }

    @PostMapping(value = {"/inscription"})
    public String ajouterClient(@ModelAttribute Client client) {
        clientRepository.save(client);
        return "index";
    }
}
