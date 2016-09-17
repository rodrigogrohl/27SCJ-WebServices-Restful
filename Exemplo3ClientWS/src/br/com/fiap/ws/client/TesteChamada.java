package br.com.fiap.ws.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class TesteChamada {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Carlos Adão");
		aluno.setTurma("27SCJ");
		aluno.setMedia(9.9);
		
		AlunoWeb alunoWebPort = new AlunoWebService().getAlunoWebPort();
		
		Map<String, Object> reg_ctx = ((BindingProvider) alunoWebPort).getRequestContext();
		
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("Username", Collections.singletonList("rodrigo"));
		headers.put("Password", Collections.singletonList("000000"));
		
		reg_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		System.out.println(alunoWebPort.novo(aluno));	
	}

}
