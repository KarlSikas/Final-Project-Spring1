package com.example.finalprojectspring.repositories;

import com.example.finalprojectspring.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Karl-Erik Sirkas
 * @Date 3/28/2023
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByName(String name);
}
