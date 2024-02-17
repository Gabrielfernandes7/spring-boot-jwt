package br.com.gabrielfernandes.springsecurityjwt.security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

/*
    Serviço responsável pela autenticação
    retorna o token de autenticação
*/

@Service
public class AuthenticationService {

    private final JwtService jwtService;

    public AuthenticationService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public String authenticate(Authentication authentication) {
        return jwtService.generateToken(authentication);
    }
}
