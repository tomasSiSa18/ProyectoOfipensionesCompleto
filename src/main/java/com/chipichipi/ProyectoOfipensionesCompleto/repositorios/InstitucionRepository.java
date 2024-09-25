package com.chipichipi.ProyectoOfipensionesCompleto.repositorios;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.chipichipi.ProyectoOfipensionesCompleto.modelo.Institucion;

public interface InstitucionRepository extends MongoRepository<Institucion, Integer>{

    @Query("{}")
    Collection<Institucion> darInstituciones();

}
