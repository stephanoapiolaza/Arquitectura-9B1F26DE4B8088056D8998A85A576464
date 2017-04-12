package cl.bilix.xps.services.negocio.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bilix.xps.common.util.ConverterMap;
import cl.bilix.xps.negocio.to.cliente.ClienteTO;
import cl.bilix.xps.negocio.to.matching.cliente.MapCliente;
import cl.bilix.xps.persistence.model.cliente.ClienteVO;
import cl.bilix.xps.services.negocio.service.ClienteService;

@Service
public class ClienteBean {
	/* Añadir Logica de negocio, si el metodo tiene mucha logica se puede dividir
	 * en  ClienteExtBean o añadir mas clases en cl.bilix.xps.services.negocio.bean.cliente.
	 * 
	 *  Esta clase hace llamadas a los recursos de persistencia y las entradas son TO que luego
	 *  deben ser manipuladas por VO y retornar un TO al controller
	 *  Este metodo se justifica,ya que el TO puede contener campos que solo pertenecen al negocio
	 *  como permisos de accion, etc*/
	
	@Autowired
	ClienteService clienteService;
	
	@SuppressWarnings("unchecked")
	public <T> T getCuentas() {		
		return (T) clienteService.getClientes();
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getCliente(long idCliente) {		
		return (T) clienteService.getCliente(idCliente);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T saveCliente(ClienteTO clienteTO) {
		// si id es 0 crea sino actualiza
		ClienteVO clienteVO = ConverterMap.ConvertCustomObject(clienteTO, ClienteVO.class, MapCliente.MatchClienteTOXVO());
		if ( clienteVO.getIdCTE() == 0 ){
			clienteVO =  this.getCliente(clienteService.insertCliente(clienteVO));
		}else{
			clienteService.updateCliente(clienteVO);
		}
		return (T) ConverterMap.ConvertCustomObject(clienteVO, ClienteTO.class, MapCliente.MatchClienteVOXTO());
	}
	
	
	@SuppressWarnings("unchecked")
	public void  deleteCuentas ( ClienteTO clienteTO){
		// elimina la cuenta
		clienteService.deleteCliente(ConverterMap.ConvertCustomObject(clienteTO, ClienteVO.class, MapCliente.MatchClienteTOXVO()));
	}
}
