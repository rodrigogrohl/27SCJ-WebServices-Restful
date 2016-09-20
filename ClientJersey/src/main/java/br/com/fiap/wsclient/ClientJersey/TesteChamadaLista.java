package br.com.fiap.wsclient.ClientJersey;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class TesteChamadaLista {
	
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://10.10.35.31:8080/ExemploJersey").path("alunos");
		Builder builder = webTarget.request(MediaType.APPLICATION_XML);
		
		Response response = builder.get();
		
		Alunos readEntity = response.readEntity(Alunos.class);
		for (Aluno a : readEntity.getAlunoList()) {
			System.out.println(a.toString());			
		}
	}

}
