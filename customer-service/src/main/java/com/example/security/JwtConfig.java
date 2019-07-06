package com.example.security;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class JwtConfig {

    @Value("${jwt.secret:s3cr3t}")
    private String secret;
}
