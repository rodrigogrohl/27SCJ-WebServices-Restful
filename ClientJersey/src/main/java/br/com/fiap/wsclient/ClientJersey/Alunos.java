package br.com.fiap.wsclient.ClientJersey;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "alunoes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Alunos {

	@XmlElement(name = "aluno")
	private List<Aluno> alunoList;

	public List<Aluno> getAlunoList() {
		return alunoList;
	}

	public void setAlunoList(List<Aluno> alunoList) {
		this.alunoList = alunoList;
	}

	public Alunos() {
		// TODO Auto-generated constructor stub
	}
}
