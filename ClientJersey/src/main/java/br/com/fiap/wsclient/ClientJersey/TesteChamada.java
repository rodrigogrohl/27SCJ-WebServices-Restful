package br.com.fiap.wsclient.ClientJersey;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class TesteChamada {
	
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://10.10.35.31:8080/ExemploJersey").path("exemplo");
		Builder builder = webTarget.request(MediaType.TEXT_PLAIN);
		
		Response response = builder.get();
		
		String readEntity = response.readEntity(String.class);
		System.out.println(readEntity);
	}

}
