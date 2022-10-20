package com.psuti.Vasilev.dao;

import com.psuti.Vasilev.entities.Kind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KindRepository extends JpaRepository<Kind, String> {
}
