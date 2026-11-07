package com.examen.ferreteria.service;

import com.examen.ferreteria.dto.ArticuloCategoriaDTO;
import com.examen.ferreteria.entity.Articulo;
import java.util.List;

public interface ArticuloService {
    List<Articulo> mostrarActivosFiltroNombre(String nombre);
    List<ArticuloCategoriaDTO> reporteArticuloCategoria();
}
