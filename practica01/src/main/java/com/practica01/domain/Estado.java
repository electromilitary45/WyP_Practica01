package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Derek
 */
@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPais;
    
    private String nombrePais;
    private String capital;
    private int poblacion;
    private int cantidadProvincias;

    public Estado() {
    }

    public Estado(String nombrePais, String capital, int poblacion, int cantidadProvincias) {
        this.nombrePais = nombrePais;
        this.capital = capital;
        this.poblacion = poblacion;
        this.cantidadProvincias = cantidadProvincias;
    }
}
