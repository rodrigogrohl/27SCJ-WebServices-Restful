package br.com.fiap.ws;

import br.com.fiap.ws.client.HelloWeb;
import br.com.fiap.ws.client.HelloWebService;

public class TestService {

	public static void main(String[] args) {
		
		HelloWeb port = new HelloWebService().getHelloWebPort();
		
		System.out.println( port.hello("Rodrigo") );
	}
}
