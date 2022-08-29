package com.example.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.entities.Client;

/*
 * O ClientReposity cria uma interface-repositório do tipo referenciado.
*/

public interface ClientRepository extends JpaRepository<Client, Long> {

}
