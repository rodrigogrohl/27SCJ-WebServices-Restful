package br.fiap.exemplos.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;


@WebService
public class AlunoWeb {
	
	private List<Aluno> alunos;
	
	@Resource
	private WebServiceContext wsctx;
	
	public boolean isAutenticado() {
		MessageContext mctx = wsctx.getMessageContext();
		Map http_header = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		List<String> usuarios = (List<String>) http_header.get("Username");
		List<String> senhas = (List<String>) http_header.get("Password");
		
		String usuario = "";
		String senha = "";
		
		if(usuarios!=null) 
			usuario = (String) usuarios.get(0);
		
		if(senhas!=null) 
			senha = (String) senhas.get(0);
	
		if(usuario.equals("rodrigo") && senha.equals("000000"))
			return true;
		
		return false;
	}
	
	@WebMethod
	public String novo(@WebParam(name="aluno") Aluno a) {
		if(isAutenticado()){
			alunos.add(a);
			return "Aluno cadastrado com sucesso!";
		} else {
			return "Falha na autenticacao :(";
		}
	}
	
	@WebMethod
	public List<Aluno> listar() throws Exception {
		if(isAutenticado())
			return alunos;
		else
			throw new Exception("Falha na Autenticacao");
	}
	
	public AlunoWeb() {
		alunos = new ArrayList<Aluno>();
	}

}
