package com.devsuperior.myclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.myclient.entities.Client;
public interface ClientRepository extends JpaRepository<Client, Long> {

}
