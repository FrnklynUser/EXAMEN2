package com.ramos.facturacion.almacen.service;

import java.util.List;
import org.springframework.data.domain.Pageable;

import com.ramos.facturacion.almacen.entity.evento;


public interface eventoService {
	public List<evento> findAll(Pageable page);
	public List<evento> findAll();
	public List<evento> finByNombre(String nombre,Pageable page);
	public evento findById(int id);
	public evento save(evento even);
	public void delete(int id);
}




