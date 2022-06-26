package com.confluenciacreativa.empleadosbackend.repositorio;

import com.confluenciacreativa.empleadosbackend.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
}
