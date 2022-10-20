package com.psuti.Vasilev.dao;

import com.psuti.Vasilev.entities.Animal;
import com.psuti.Vasilev.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnimalRepository extends JpaRepository<Animal, UUID> {

}
