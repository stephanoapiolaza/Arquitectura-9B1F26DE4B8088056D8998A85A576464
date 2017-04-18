package cl.bilix.xps.services.negocio.utils.to.matching;

import org.modelmapper.PropertyMap;

import cl.bilix.xps.persistence.model.utils.ClienteVO;
import cl.bilix.xps.services.negocio.utils.to.ClienteTO;

public class MapCliente {
	public static <F,T>PropertyMap MatchClienteVOXTO(){
		PropertyMap<ClienteVO, ClienteTO> map = new PropertyMap<ClienteVO, ClienteTO>() {
			@Override
			protected void configure() {
				// TODO Auto-generated method stub
				map().setIdCliente(source.getIdCTE());
				map().setNombreCliente(source.getNombreCTE());
			}
		};
		return map;
	}
	
	public static <F,T>PropertyMap MatchClienteTOXVO(){
		PropertyMap<ClienteTO, ClienteVO> map = new PropertyMap<ClienteTO, ClienteVO>() {
			@Override
			protected void configure() {
				// TODO Auto-generated method stub
				map().setIdCTE(source.getIdCliente());
				map().setNombreCTE(source.getNombreCliente());
			}
		};
		return map;
	}
}

