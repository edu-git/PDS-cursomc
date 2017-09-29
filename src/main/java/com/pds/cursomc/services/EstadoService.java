package com.pds.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pds.cursomc.domain.Estado;
import com.pds.cursomc.repositories.EstadoRepository;
import com.pds.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public Estado buscar(Integer id) {
		Estado obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: "+id
					+ ", tipo: "+ Estado.class.getName());
		}
		return obj;
	}
	
	public void inserir(Estado obj) {
		obj.setId(null);
		repo.save(obj);
	}

}
