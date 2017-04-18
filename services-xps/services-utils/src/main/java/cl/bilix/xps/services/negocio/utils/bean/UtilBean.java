package cl.bilix.xps.services.negocio.utils.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bilix.xps.common.util.ConverterMap;
import cl.bilix.xps.persistence.model.utils.ClienteVO;
import cl.bilix.xps.services.negocio.utils.service.UtilService;
import cl.bilix.xps.services.negocio.utils.to.ClienteTO;
import cl.bilix.xps.services.negocio.utils.to.matching.MapCliente;

@Service
public class UtilBean {
	/*
	 * Capa de negocio de servicios utilitarios, mantenedores, etc.
	 */
	
	@Autowired
	UtilService utilService;
	
	@SuppressWarnings("unchecked")
	public <T> List<T> findClientes(ClienteTO clienteTO){
		ClienteVO clienteVO = ConverterMap.ConvertObject(clienteTO, ClienteVO.class);
		return (List<T>) this.utilService.findClientes(clienteVO);
	}
	
}
