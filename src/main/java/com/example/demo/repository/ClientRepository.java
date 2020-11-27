package com.example.demo.repository;

import com.example.demo.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
    public List<Client> findAll();

    public Client findById(int id);

    public Client save(Client client);

    public Client deleteById(int id);
}
