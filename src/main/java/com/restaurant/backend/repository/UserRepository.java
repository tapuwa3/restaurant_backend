package com.restaurant.backend.repository;

import com.restaurant.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Generic type of User, used to find users by a given parameter,
     * which is email in this case.
     * @param email String of user's email address
     * @return User
     */
    Optional<User> findByEmail (String email);

}
