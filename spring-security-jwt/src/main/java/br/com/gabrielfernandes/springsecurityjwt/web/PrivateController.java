package br.com.gabrielfernandes.springsecurityjwt.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/*
    Minha rota protegida
    Só poderá ser acessada após a autenticação
*/

@RestController
@RequestMapping("private")
public class PrivateController {

    @GetMapping
    public String getMessage() {
        return "Hello from private API Controller";
    }
    
}
