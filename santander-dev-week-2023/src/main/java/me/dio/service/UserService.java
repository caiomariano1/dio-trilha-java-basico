package me.dio.service;

import me.dio.domain.model.User;

/**
 * Usamos o encapsulamento de código para não expor a implementação do código.
 *
 * @author caiomariano1
 */

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}