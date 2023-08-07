package com.crudclientes.clientes.repositories;

import com.crudclientes.clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
