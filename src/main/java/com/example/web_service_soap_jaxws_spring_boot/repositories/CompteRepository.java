package com.example.web_service_soap_jaxws_spring_boot.repositories;


import com.example.web_service_soap_jaxws_spring_boot.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {}