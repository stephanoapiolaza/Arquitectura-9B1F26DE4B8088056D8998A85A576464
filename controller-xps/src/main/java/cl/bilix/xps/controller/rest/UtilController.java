package cl.bilix.xps.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.bilix.xps.common.constants.ConstantsSwagger;
import cl.bilix.xps.services.negocio.utils.bean.UtilBean;
import cl.bilix.xps.services.negocio.utils.to.ClienteTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/rest/clientes/")
@Api(value = "API CLIENTES", description = "Servicios de Clientes", produces = ConstantsSwagger.RESPONSE_TYPE)
@CrossOrigin
public class UtilController {
	
	@Autowired
	UtilBean utilBean;
	
	@RequestMapping(value="/all/",produces="application/json", method=RequestMethod.POST)
	//documentar
	@ApiOperation(value = "Obtener clientes", notes = "Retorna los clientes filtrado por el modelo") 
	public <T> List<T> findClientes(@RequestBody(required = false) ClienteTO cliente){
		return (List<T>)this.utilBean.findClientes(cliente);
	}
}
