package cl.golan.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import cl.golan.entitys.Cliente;
import cl.golan.entitys.Sucursal;

@Repository
public interface RepoSucursal extends CrudRepository<Sucursal, Long> {
	
	List<Sucursal> findByCliente(Cliente cliente);
	
}