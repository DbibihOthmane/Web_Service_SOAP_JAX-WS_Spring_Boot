package com.example.web_service_soap_jaxws_spring_boot.entities;

import com.example.web_service_soap_jaxws_spring_boot.enums.TypeCompte;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@XmlRootElement(name = "Compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Long id;

    @XmlElement(required = true)
    private Double solde;

    public Compte() {
    }

    public Compte(Long id, double solde, LocalDate dateCreation, TypeCompte type) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
    }

    // BEST FIX: Use LocalDate instead of Date → JAXB loves it out of the box
    @XmlElement(required = true)
    @Column(nullable = false)
    private LocalDate dateCreation;

    @XmlElement(required = true)
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeCompte type;
}