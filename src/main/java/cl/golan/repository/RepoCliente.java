package cl.golan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.golan.entitys.Cliente;


@Repository
public interface RepoCliente extends JpaRepository<Cliente, Long> {
	
	Cliente findByNombre(String nombre);
	
}