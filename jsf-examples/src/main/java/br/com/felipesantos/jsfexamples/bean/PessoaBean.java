package br.com.felipesantos.jsfexamples.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "pessoaBean")
@ViewScoped 		// descarta o ManagedBean no refresh da tela | n requests com o mesmo ManagedBean | quando necessita exibir dados atualizados na tela
@RequestScoped 		// descarta o ManagedBean depois da request | cada request é um novo ManagedBean | usada para realizar um cadastro
@SessionScoped  	// descarta o ManagedBean depois que o navegador é fechado | n requests com o mesmo ManagedBean, pode dar refresh na página 
@ApplicationScoped  // descarta o ManagedBean depois que a aplicação fecha | n requests com o mesmo ManagedBean, pode dar refresh, pode abrir outro navegador
public class PessoaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	
	private List<String> nomes = new ArrayList<>();
		
	public String mostrarNomeCompleto() {
		nomeCompleto = nome + " " + sobrenome;
		return "";
	}
	
	public String adicionarNome() {
		this.nomes.add(nome);
		return "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public List<String> getNomes() {
		return nomes;
	}
	
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	// http://localhost:8080/jsf-examples/faces/index.xhtml
}
