package com.ramos.facturacion.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramos.facturacion.almacen.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	public Usuario findByEmail(String email);
}
