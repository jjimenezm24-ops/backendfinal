package com.examen.ferreteria.service;

import com.examen.ferreteria.dto.ArticuloCategoriaDTO;
import com.examen.ferreteria.entity.Articulo;
import com.examen.ferreteria.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ArticuloServiceImpl implements ArticuloService {
    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public List<Articulo> mostrarActivosFiltroNombre(String nombre) {
        return articuloRepository.findActivosFiltroNombre(nombre);
    }
    @Override
    public List<ArticuloCategoriaDTO> reporteArticuloCategoria() {
        return articuloRepository.obtenerReporteArticuloCategoria();
    }
}
