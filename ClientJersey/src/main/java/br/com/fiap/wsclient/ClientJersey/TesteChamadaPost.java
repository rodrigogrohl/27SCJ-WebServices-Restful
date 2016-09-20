package br.com.fiap.wsclient.ClientJersey;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class TesteChamadaPost {
	
	public static void main(String[] args) {
		Aluno a = new Aluno(2.9, "Bart Simpson", "SCJ-Springfield");
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://10.10.35.31:8080/ExemploJersey").path("aluno");
		Builder builder = webTarget.request(MediaType.APPLICATION_XML);
		
		Response response = builder.post(Entity.entity(a, MediaType.APPLICATION_XML));
		
		Retorno r = response.readEntity(Retorno.class);
		
		System.out.println(r);
	}

}
