package com.practica01.dao;

import com.practica01.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Derek
 */
public interface EstadoDao extends JpaRepository<Estado, Long>{
    
}
