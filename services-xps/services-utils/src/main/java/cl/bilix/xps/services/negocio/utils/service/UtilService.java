package cl.bilix.xps.services.negocio.utils.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bilix.xps.common.error.ListNullException;
import cl.bilix.xps.persistence.mapper.utils.ClienteMapper;
import cl.bilix.xps.persistence.model.utils.ClienteVO;

@Service
public class UtilService {
	/*
	 * Capa de transaccion de servicios utilitarios, mantenedores, etc.
	 */
	@Autowired
	ClienteMapper clienteMapper;
	
	public List<ClienteVO> findClientes(ClienteVO clienteVO){
		List<ClienteVO> listCuenta = clienteMapper.findClientes(clienteVO);
		if (listCuenta == null) {
			throw new ListNullException();
		}
		return listCuenta;
	}

}
