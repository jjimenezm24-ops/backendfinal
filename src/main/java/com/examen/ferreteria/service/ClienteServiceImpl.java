package com.examen.ferreteria.service;
import com.examen.ferreteria.dto.ClienteFacturaDTO;
import com.examen.ferreteria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteFacturaDTO> reporteClienteFactura() {
        return clienteRepository.obtenerReporteClienteFactura();
    }
}
