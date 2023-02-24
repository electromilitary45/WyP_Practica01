package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPais;

    private String nombre;
    private String capital;
    private int poblacion;
    private int provincias;

    public Estado() {
    }

    public Estado(Long idPais, String nombre, String capital, int poblacion, int provincias) {
        this.idPais = idPais;
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.provincias = provincias;
    }

}
