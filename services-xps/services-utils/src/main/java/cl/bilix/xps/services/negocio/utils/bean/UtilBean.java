package cl.bilix.xps.services.negocio.utils.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bilix.xps.common.util.ConverterMap;
import cl.bilix.xps.persistence.model.utils.ClienteVO;
import cl.bilix.xps.services.negocio.to.matching.MapCliente;
import cl.bilix.xps.services.negocio.utils.service.UtilService;
import cl.bilix.xps.services.negocio.utils.to.ClienteTO;

@Service
public class UtilBean {
	/*
	 * Capa de negocio de servicios utilitarios, mantenedores, etc.
	 */
	
	@Autowired
	UtilService utilService;
	
	@SuppressWarnings("unchecked")
	public <T> T findClientes(ClienteTO clienteTO){
		ClienteVO clienteVO = ConverterMap.ConvertObject(clienteTO, ClienteVO.class);
		return (T) this.utilService.findClientes(clienteVO);
	}
	
}
