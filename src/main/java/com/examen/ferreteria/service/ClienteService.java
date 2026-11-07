package com.examen.ferreteria.service;
import com.examen.ferreteria.dto.ClienteFacturaDTO;
import java.util.List;
public interface ClienteService {
    List<ClienteFacturaDTO> reporteClienteFactura();
}