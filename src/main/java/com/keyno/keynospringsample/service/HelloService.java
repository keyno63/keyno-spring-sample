package com.keyno.keynospringsample.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String get(String type_a, String type_b)
    {
        StringBuilder sb = new StringBuilder()
                .append("request:")
                .append(type_a)
                .append(",")
                .append(type_b);
        return sb.toString();
    }
}
