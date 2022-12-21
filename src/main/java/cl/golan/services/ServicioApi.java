package cl.golan.services;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.golan.entitys.Cliente;
import cl.golan.entitys.Sucursal;
import cl.golan.repository.RepoCliente;
import cl.golan.repository.RepoSucursal;

@Service
public class ServicioApi {

	@Autowired
	RepoCliente repo_cliente;
	
	@Autowired
	RepoSucursal repo_sucursales;
	
	public Map<String, Object> data(String nombre){
		
		Map<String, Object> data 	= new LinkedHashMap<String, Object>();
		List<String> suc 			= new ArrayList<String>();
		
		Cliente cliente 			= repo_cliente.findByNombre(nombre);
		
		List<Sucursal> sucursales 	= repo_sucursales.findByCliente(cliente);
		
		for (Sucursal sucursal : sucursales) {
			suc.add(sucursal.getDireccion());
		}
		
		data.put("nombre_cliente", cliente.getNombre());
		data.put("direccion_sucursales", suc);			
		
		return data;
	}
	
}
