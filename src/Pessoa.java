import java.time.LocalDate;
import java.util.ArrayList;

public class Pessoa {
//Atributo
	private String nome;
	private LocalDate dataNasc;
	private String sexo;
	private String cidade;
	private String UF;
	private Empresa empresa;
	
	//
	private ArrayList<Contato> contatos;

	public Pessoa(String nome, LocalDate dataNasc, String sexo, String cidade, String uF, Empresa empresa,
			ArrayList<Contato> contatos) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.cidade = cidade;
		UF = uF;
		this.empresa = empresa;
		this.contatos = contatos;
	}

	//Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	
	
	
	
	
	
}
