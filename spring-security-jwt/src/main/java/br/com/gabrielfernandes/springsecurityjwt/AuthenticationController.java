package br.com.gabrielfernandes.springsecurityjwt;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String authenticate() {
        return authenticationService.authenticate();
    }
}
