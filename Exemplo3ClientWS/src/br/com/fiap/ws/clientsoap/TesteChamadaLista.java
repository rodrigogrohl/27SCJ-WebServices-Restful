package br.com.fiap.ws.clientsoap;

public class TesteChamadaLista {
	
	public static void main(String[] args) throws Exception_Exception {
		
		AlunoWeb alunoWebPort = new AlunoWebService().getAlunoWebPort();
		
		Listar parameters = new Listar();
		
		ListarResponse listar = alunoWebPort.listar(parameters, "rodrigo", "000000");
		for (Aluno aluno : listar.getReturn()) {
			System.out.println(aluno);	
		}
	}

}
