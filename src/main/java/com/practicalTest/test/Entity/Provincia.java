package com.practicalTest.test.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Provincia {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idprovincia;
    private String name;

}
