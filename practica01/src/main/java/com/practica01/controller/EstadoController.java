package com.practica01.controller;

import com.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Derek
 */
@Controller
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    //Mapeo
    @GetMapping("/")
    public String inicio(Model model) {
        var estados = estadoService.getEstado();
        model.addAttribute("estado", estados);
        return "index";
    }

    @GetMapping("/estado/eliminar/{idPais}")
    public String eliminarEstado(Estado estado) {
        estadoService.deleteEstado(estado);
        return "redirect:/";
    }

    @GetMapping("/estado/nuevo")
    public String nuevoEstado(Estado estado) {
        return "agregarEstado";
    }

    @PostMapping("/estado/guardar")
    public String guardarEstado(Estado estado) {
        estadoService.saveEstado(estado);
        return "redirect:/";
    }

    @GetMapping("/estado/modificar/{idPais}")
    public String modificaEstado(Estado estado, Model model) {
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificarEstado";
    }

}
