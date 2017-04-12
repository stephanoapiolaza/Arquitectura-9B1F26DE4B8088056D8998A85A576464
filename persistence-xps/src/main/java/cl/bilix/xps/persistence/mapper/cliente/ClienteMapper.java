package cl.bilix.xps.persistence.mapper.cliente;

import cl.bilix.xps.persistence.model.cliente.ClienteVO;

public interface ClienteMapper {
	java.util.List<ClienteVO> getClienteList ();
	
	ClienteVO getClienteById ( long id );
	
	long insertCliente ( ClienteVO clienteVO );
	
	void updateCliente ( ClienteVO clienteVO );
	
	void deleteCliente ( ClienteVO clienteVO );
}
