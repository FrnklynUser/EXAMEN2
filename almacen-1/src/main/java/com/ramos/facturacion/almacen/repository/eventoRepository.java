package com.ramos.facturacion.almacen.repository;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ramos.facturacion.almacen.entity.evento;



@Repository
public interface eventoRepository extends JpaRepository<evento, Integer>{
	List<evento> findByNombreContaining(String nombre,Pageable page);
}



