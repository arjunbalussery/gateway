package com.arjun.gateway.bean.auth;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class JwtToken {
    @Id
    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    public JwtToken() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
