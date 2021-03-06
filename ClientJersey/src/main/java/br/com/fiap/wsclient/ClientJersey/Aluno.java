package br.com.fiap.wsclient.ClientJersey;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aluno")
@XmlAccessorType(XmlAccessType.FIELD)
public class Aluno {
	
	private double media;
	private String nome;
	private String turma;
	
	public Aluno() { }

	public Aluno(double media, String nome, String turma) {
		super();
		this.media = media;
		this.nome = nome;
		this.turma = turma;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Aluno [media=" + media + ", nome=" + nome + ", turma=" + turma + "]";
	}

	
}
