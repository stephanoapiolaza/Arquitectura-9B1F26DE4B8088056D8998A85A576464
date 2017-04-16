package cl.bilix.xps.persistence.mapper.utils;

import cl.bilix.xps.persistence.model.utils.ClienteVO;

public interface ClienteMapper {
	java.util.List<ClienteVO> findClientes (ClienteVO clienteVO);

}
