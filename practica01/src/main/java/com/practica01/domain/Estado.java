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
    
    private String nombrepais;
    private String capitalpais;
    private int poblacion;
    private int cantidadprovincias;

    public Estado() {
    }

    public Estado(Long idPais, String nombrepais, String capitalpais, int poblacion, int cantidadprovincias) {
        this.idPais=idPais;
        this.nombrepais = nombrepais;
        this.capitalpais = capitalpais;
        this.poblacion = poblacion;
        this.cantidadprovincias = cantidadprovincias;
    }
}
