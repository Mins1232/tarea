package com.idat.tarea2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idat.tarea2.model.Estudiantes;

@RepositoryRestResource(path="estudiante")
public interface EstudianteRepository extends JpaRepository<Estudiantes, Integer> {

}
