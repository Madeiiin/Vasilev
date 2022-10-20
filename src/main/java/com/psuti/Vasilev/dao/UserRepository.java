package com.psuti.Vasilev.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.psuti.Vasilev.entities.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
