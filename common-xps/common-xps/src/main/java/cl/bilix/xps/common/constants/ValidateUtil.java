package cl.bilix.xps.common.constants;

import cl.bilix.xps.common.error.ValidateException;

public class ValidateUtil {
	
	public static int validaNullNumerico(String valor){
		int retorno = 0;
		try{
			if ( valor != null ){
				retorno = Integer.parseInt(valor);
			}
		}catch( Exception e ){
			throw new ValidateException();
		}
		return retorno;
	}
	
}
