package com.pds.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pds.cursomc.domain.Categoria;
import com.pds.cursomc.repositories.CategoriaRepository;
import com.pds.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: "+id
					+ ", tipo: "+ Categoria.class.getName());
		}
		return obj;
	}

}
