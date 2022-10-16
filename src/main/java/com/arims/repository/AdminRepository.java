package com.arims.repository;

import com.arims.model.Admin;
import com.arims.model.Cbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

    void deleteAdminById(Long id);

    Optional<Admin> findAdminById(Long id);

}
