package br.com.fiap.ws.clientsoap;

public class TesteChamada {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Carlos Adão");
		aluno.setTurma("27SCJ");
		aluno.setMedia(9.9);
		
		AlunoWeb alunoWebPort = new AlunoWebService().getAlunoWebPort();

		Novo parametro = new Novo();
		parametro.setAluno(aluno);
		NovoResponse response = alunoWebPort.novo(parametro, "rodrigo", "000000");
		System.out.println(response.getReturn());
		
	}

}
