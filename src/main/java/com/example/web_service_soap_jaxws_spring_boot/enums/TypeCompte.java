package com.example.web_service_soap_jaxws_spring_boot.enums;


import jakarta.xml.bind.annotation.XmlEnumValue;

public enum TypeCompte {
    @XmlEnumValue("COURANT") COURANT,
    @XmlEnumValue("EPARGNE") EPARGNE
}
