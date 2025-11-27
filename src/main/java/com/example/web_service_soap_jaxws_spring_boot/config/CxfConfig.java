package com.example.web_service_soap_jaxws_spring_boot.config;


import com.example.web_service_soap_jaxws_spring_boot.ws.CompteSoapService;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfig {

    private CompteSoapService compteSoapService;
    private Bus bus;

    public CxfConfig(CompteSoapService compteSoapService, Bus bus) {
        this.compteSoapService = compteSoapService;
        this.bus = bus;
    }

    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, compteSoapService);
        endpoint.publish("/ws");
        return endpoint;
    }
}