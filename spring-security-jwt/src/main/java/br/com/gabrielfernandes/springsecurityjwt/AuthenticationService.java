package br.com.gabrielfernandes.springsecurityjwt;

import org.springframework.stereotype.Service;

/*
    Serviço responsável pela autenticação
    retorna o token de autenticação
*/

@Service
public class AuthenticationService {
    public String authenticate() {
        return "token";
    }
}
