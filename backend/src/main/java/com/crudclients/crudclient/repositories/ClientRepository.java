package com.crudclients.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudclients.crudclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}