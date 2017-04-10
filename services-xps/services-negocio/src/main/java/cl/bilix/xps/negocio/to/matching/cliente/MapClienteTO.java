package cl.bilix.xps.negocio.to.matching.cliente;

import org.modelmapper.PropertyMap;


public class MapClienteTO {
	public static <F,T>PropertyMap getClienteStrictMap(){
		PropertyMap<ClienteVO, ClienteTO> map = new PropertyMap<ClienteVO, ClienteTO>() {
			@Override
			protected void configure() {
				// TODO Auto-generated method stub
				/*map().setMoneda(source.getTipoMON());
				map().setMonto(source.getMontoTotalConvOPO());
				map().setName(source.getNombreEST());*/
			}
		};
		return map;
	}
}
