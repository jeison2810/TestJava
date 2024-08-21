package com.practicalTest.test.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.practicalTest.test.Entity.Provincia;
import com.practicalTest.test.Repository.ProvinciaRepository;
import com.practicalTest.test.Service.ProvinciaService;

@Service
public class ProvinciaServiceImpl implements ProvinciaService{

    private ProvinciaRepository provinciaRepository;

    public ProvinciaServiceImpl(ProvinciaRepository provinciaRepository) {
        this.provinciaRepository = provinciaRepository;
    }

    @Override
    public Provincia save(Provincia provincia) {
        try {
            return provinciaRepository.save(provincia);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Error save Error: " + ex.getMessage());
        }
    }

    @Override
    public Optional<Provincia> findById(Integer provincia) {
        try {
            return provinciaRepository.findById(provincia);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Error findById Error: " + ex.getMessage());
        }
    }

    @Override
    public List<Provincia> findAll() {
        try {
            return provinciaRepository.findAll();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Error findAll Error: " + ex.getMessage());
        }
    }

}
