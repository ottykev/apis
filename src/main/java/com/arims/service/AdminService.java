package com.arims.service;


import com.arims.exception.UserNotFoundException;
import com.arims.model.Admin;
import com.arims.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin add(Admin admin) {
        return adminRepository.save(admin);
    }

    public void deleteAdmin(Long id) {
        this.adminRepository.deleteAdminById(id);
    }

    public List<Admin> findAllAdmin() {
        return this.adminRepository.findAll();
    }

    public Admin updateAdmin(Admin admin) {
        return (Admin)this.adminRepository.save(admin);
    }

    public Admin findAdminById(Long id) {
        return (Admin)this.adminRepository.findAdminById(id).orElseThrow(() -> {
            return new UserNotFoundException("Administrative unit  by id " + id + " was not found");
        });
    }

}
