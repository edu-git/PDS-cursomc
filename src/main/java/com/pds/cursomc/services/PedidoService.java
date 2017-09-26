package com.pds.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pds.cursomc.domain.Pedido;
import com.pds.cursomc.repositories.PedidoRepository;
import com.pds.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: "+id
					+ ", tipo: "+ Pedido.class.getName());
		}
		return obj;
	}

}
