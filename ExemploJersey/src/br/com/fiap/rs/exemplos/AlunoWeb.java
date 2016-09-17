package br.com.fiap.rs.exemplos;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("alunos")
public class AlunoWeb {

	static private List<Aluno> alunos;
	
	static {
		alunos = new ArrayList<Aluno>();
		
		Aluno alunoA = new Aluno();
		alunoA.setNome("Carlos Adão");
		alunoA.setTurma("27SCJ");
		alunoA.setMedia(9.9);
		
		alunos.add(alunoA);
		
		Aluno alunoB = new Aluno();
		alunoB.setNome("Pablo Escobar");
		alunoB.setTurma("27SCJ");
		alunoB.setMedia(5.6);
		
		alunos.add(alunoB);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Aluno> getAlunos() {
		return alunos;
	}
	
}
