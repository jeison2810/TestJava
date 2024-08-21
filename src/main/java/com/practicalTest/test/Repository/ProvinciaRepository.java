package com.practicalTest.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practicalTest.test.Entity.Provincia;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia,Integer>{
    
}
