package com.example.web_service_soap_jaxws_spring_boot.entities;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, Date> {
    private final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    @Override
    public Date unmarshal(String v) throws Exception { return df.parse(v); }

    @Override
    public String marshal(Date v) throws Exception { return df.format(v); }
}
