package com.chipichipi.ProyectoOfipensionesCompleto.servicios;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chipichipi.ProyectoOfipensionesCompleto.modelo.Institucion;
import com.chipichipi.ProyectoOfipensionesCompleto.repositorios.InstitucionRepository;

@Service
public class InstitucionServicio {

    @Autowired
    private InstitucionRepository institucionRepository;

    @Transactional
    public Collection<Institucion> getInstituciones() {
        return institucionRepository.darInstituciones();
    }

    @Transactional
    public Institucion crearInstitucion(Institucion institucion) {

        return institucionRepository.save(institucion);
    }
    
}
