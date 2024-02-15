package br.com.gabrielfernandes.springsecurityjwt;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String>{

    // retorna o usuário, caso o encontre
    Optional<User> findByUsername(String username);
}
