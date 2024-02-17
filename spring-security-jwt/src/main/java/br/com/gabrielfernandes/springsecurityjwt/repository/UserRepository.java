package br.com.gabrielfernandes.springsecurityjwt.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.gabrielfernandes.springsecurityjwt.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{

    // retorna o usuário, caso o encontre
    Optional<User> findByUsername(String username);
}
