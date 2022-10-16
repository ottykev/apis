package com.arims.service;

import com.arims.exception.UserNotFoundException;
import com.arims.model.Admin;
import com.arims.model.Cbo;
import com.arims.repository.CboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CboService {

    @Autowired
    private CboRepository cboRepository;

    public CboService() {
    }

    public Cbo add1(Cbo cbo) {
        cbo.setProvinceCode(UUID.randomUUID().toString());
        return cboRepository.save(cbo);
    }


    public void deleteCbo(Long id) {
        this.cboRepository.deleteCboById(id);
    }

    public List<Cbo> findAllCbo() {
        return this.cboRepository.findAll();
    }

    public Cbo updateCbo(Cbo cbo) {
        return (Cbo)this.cboRepository.save(cbo);
    }

    public Cbo findCboById(Long id) {
        return (Cbo)this.cboRepository.findCboById(id).orElseThrow(() -> {
            return new UserNotFoundException("Community of id  " + id + " was not found");
        });
    }
}
