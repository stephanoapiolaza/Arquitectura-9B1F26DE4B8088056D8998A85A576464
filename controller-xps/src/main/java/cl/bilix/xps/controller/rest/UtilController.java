package cl.bilix.xps.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.bilix.xps.services.negocio.utils.bean.UtilBean;
import cl.bilix.xps.services.negocio.utils.to.ClienteTO;

@RestController
public class UtilController {
	
	@Autowired
	UtilBean utilBean;
	
	@RequestMapping(value="/Clientes/",produces="application/json", method=RequestMethod.GET)
	public <T> T findClientes(@RequestParam ClienteTO cliente){
		return this.utilBean.findClientes(cliente);
	}
}
