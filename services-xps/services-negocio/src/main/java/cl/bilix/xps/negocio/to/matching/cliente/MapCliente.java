package cl.bilix.xps.negocio.to.matching.cliente;

import org.modelmapper.PropertyMap;

import cl.bilix.xps.negocio.to.cliente.ClienteTO;
import cl.bilix.xps.persistence.model.cliente.ClienteVO;


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
