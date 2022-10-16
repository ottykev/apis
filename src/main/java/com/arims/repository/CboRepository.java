package com.arims.repository;

import com.arims.model.Cbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CboRepository extends JpaRepository<Cbo,Long> {

    void deleteCboById(Long id);

    Optional<Cbo> findCboById(Long id);
}
