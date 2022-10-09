package com.example.uniprojektbackend.config;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenGenerator {
    private Long Token_Validet=604800L;
    @Value("${auth.secret}")
    private  String Token_Secret;
    private String generateToken(UserDetails userDetails){
        //clims info from user pass and name
        // expration
        //sign
        //compact
        Map<String,Object> claims=new HashMap<>();
        claims.put("sub",userDetails.getUsername());
        claims.put("created",new Date());
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpiration())
                .signWith(SignatureAlgorithm.HS512,Token_Secret)
                .compact(); // convert to String

    }

    private Date generateExpiration(){
      return new Date(System.currentTimeMillis()+Token_Validet*1000);
    }
}
