package com.examen.ferreteria.controller;

import com.examen.ferreteria.dto.ArticuloCategoriaDTO;
import com.examen.ferreteria.entity.Articulo;
import com.examen.ferreteria.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/articulos")
@CrossOrigin(origins = "*")
public class ArticuloController {
    @Autowired
    private ArticuloService articuloService;

    @GetMapping("/mostrarActivosFiltroNombre")
    public List<Articulo> mostrarActivosFiltroNombre(@RequestParam(defaultValue = "") String nombre) {
        return articuloService.mostrarActivosFiltroNombre(nombre);
    }
    @GetMapping("/reporteArticuloCategoria")
    public List<ArticuloCategoriaDTO> reporteArticuloCategoria() {
        return articuloService.reporteArticuloCategoria();
    }
}