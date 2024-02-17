package br.com.gabrielfernandes.springsecurityjwt.web;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielfernandes.springsecurityjwt.security.AuthenticationService;

/*
    Controlador responsável pela autenticação
    Irá chamar um serviço de autenticação
*/

@RestController
public class AuthenticationController {
    public final AuthenticationService authenticationService;

    // Injeção por meio do construtor
    // injeção do nosso serviço de autenticação
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    // Chamo o meu serviço
    @PostMapping("authenticate")
    public String authenticate(Authentication authentication) {
        // usuário e senha já está injetado no objto authentication
        return authenticationService.authenticate(authentication);
    }
}
