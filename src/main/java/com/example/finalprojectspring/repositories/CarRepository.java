package com.example.finalprojectspring.repositories;

import com.example.finalprojectspring.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Sergei Oksanen
 * @Date 3/23/2023
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {


    Optional<Car> findByModelName(String modelName);
}
