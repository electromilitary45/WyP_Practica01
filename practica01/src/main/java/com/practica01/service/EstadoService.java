package com.practica01.service;

import com.practica01.domain.Estado;
import java.util.List;

/**
 *
 * @author Derek
 */
public interface EstadoService {
    public List<Estado> getEstado();
    
    public Estado getEstado(Estado estado);
    
    public void deleteEstado(Estado estado);
    
    public void saveEstado(Estado estado);
}
