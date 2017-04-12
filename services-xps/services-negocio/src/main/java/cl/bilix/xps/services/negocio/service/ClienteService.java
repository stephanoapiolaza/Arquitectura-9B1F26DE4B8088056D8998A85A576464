package cl.bilix.xps.services.negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.bilix.xps.common.error.ListNullException;
import cl.bilix.xps.common.error.PersistenceException;
import cl.bilix.xps.persistence.mapper.cliente.ClienteMapper;
import cl.bilix.xps.persistence.model.cliente.ClienteVO;

public class ClienteService {
	/* 
	 * Consume la interfaz que se encarga de enviar la solicitud al mapper.xml (mybatis), 
	 * no aplicar logica de negocio, solo llamadas y retornos.
	 */
	
	@Autowired
	ClienteMapper clienteMapper;
	
	public List<ClienteVO> getClientes() {
		List<ClienteVO> listCuenta = clienteMapper.getClienteList();
		if (listCuenta == null) {
			throw new ListNullException();
		}
		return listCuenta;
	}
	
	public ClienteVO getCliente(long idCTE) {
		return clienteMapper.getClienteById(idCTE);
	}
	
	public long insertCliente(ClienteVO clienteVO) {
		long idCliente = 0;
		try {
			idCliente = clienteMapper.insertCliente(clienteVO);
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
		return idCliente;
	}

	public void updateCliente(ClienteVO clienteVO) {
		try {
			clienteMapper.updateCliente(clienteVO);
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
	}
	
	public void deleteCliente ( ClienteVO clienteVO ){
		try {
			clienteMapper.deleteCliente( clienteVO );
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
	}
}
