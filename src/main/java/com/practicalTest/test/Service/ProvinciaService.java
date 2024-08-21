package com.practicalTest.test.Service;

import java.util.List;
import java.util.Optional;

import com.practicalTest.test.Entity.Provincia;

public interface ProvinciaService {

    Provincia save(Provincia provincia);

    Optional<Provincia> findById(Integer provincia);

    List<Provincia> findAll();

}
