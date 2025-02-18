package com.ramos.facturacion.almacen.converter;


import java.util.Date;

import org.springframework.stereotype.Component;

import com.ramos.facturacion.almacen.dto.eventoDto;
import com.ramos.facturacion.almacen.entity.evento;


@Component
public class eventoConverter extends AbstractConverter<evento, eventoDto>{
	@Override
	public eventoDto fromEntity(evento entity) {
		if(entity==null) return null;
		return eventoDto.builder()
				.id(entity.getId())
				.nombre(entity.getNombre())
				.descripcion(entity.getDescripcion())
				.fechaFin(entity.getFechaFin())
				.fechaInicio(entity.getFechaInicio())
				.miDatoDecimal(entity.getMiDatoDecimal())
				.build();
	}

	@Override
	public evento fromDTO(eventoDto dto) {
		if(dto==null) return null;
		return evento.builder()
				.id(dto.getId())
				.nombre(dto.getNombre())
				.descripcion(dto.getDescripcion())
				.fechaFin(dto.getFechaFin())
				.fechaInicio(dto.getFechaInicio())
				.miDatoDecimal(dto.getMiDatoDecimal())
				.build();
	}
}







