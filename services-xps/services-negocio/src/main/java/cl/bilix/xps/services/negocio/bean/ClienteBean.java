package cl.bilix.xps.services.negocio.bean;

import cl.bilix.xps.negocio.to.matching.cliente.MapClienteTO;

@Service
public class ClienteBean {
	/* Añadir Logica de negocio, si el metodo tiene mucha logica se puede dividir
	 * en  ClienteExtBean o añadir mas clases en cl.bilix.xps.services.negocio.bean.cliente.
	 * 
	 *  Esta clase hace llamadas a los recursos de persistencia y las entradas son TO que luego
	 *  deben ser manipuladas por VO y retornar un TO al controller*/
	
	@Autowired
	ClienteService clienteService;
	
	@SuppressWarnings("unchecked")
	public <T> T getCuentas() {		
		return (T) clienteService.getClientes();
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getCliente(ClienteTO clienteTO) {		
		return (T) clienteService.getCliente();
	}
	
	@SuppressWarnings("unchecked")
	public <T> T saveCliente(CuentaTO cuentaTO, String token) {
		TokenTO tokenTO = tokenBean.recuperarTokenDto(token);
		
		CuentaVO cuentaVO = ConverterMap.ConvertObject(cuentaTO, CuentaVO.class);
		if(cuentaVO.getRazonSocialCTA().isEmpty() || cuentaVO.getRazonSocialCTA()==null){
			cuentaVO.setRazonSocialCTA(cuentaVO.getNombreCTA());
		}
		if(cuentaTO.getIdCTA()==0){
			cuentaVO.setActivaCTA(true);
			cuentaService.insertCuenta(cuentaVO);
		} else {
			cuentaService.updateCuenta(cuentaVO);
		}
		return (T) getDetalleCuenta(cuentaVO.getIdCTA(),token);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T deleteCuentas ( TablaCuenta tabla, String token){
		// Desabilita la cuenta
		for ( CuentaListVO cuenta : tabla.getLstCuentas() ){
			cuenta.setActivaCTA(false);
			cuentaService.deleteCuenta(cuenta);
		}
		return this.getCuentasAffected(tabla);
	}
}
