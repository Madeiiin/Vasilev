package com.psuti.Vasilev.dao;

import com.psuti.Vasilev.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
