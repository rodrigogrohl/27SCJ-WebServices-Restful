/**
 * 
 */
package br.com.fiap.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author rm48236
 *
 */
@WebService
public class HelloWeb {
	
	@WebMethod
	public String hello(final String nome) {
		return "Ola " + nome;
	}

}
