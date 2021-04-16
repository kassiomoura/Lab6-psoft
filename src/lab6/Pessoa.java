package lab6;

import classesState.EstadoVacinacao;
import classesState.NaoVacinada;

public class Pessoa {
	private String nome;

	private String cpf;

	private String endereco;

	private String cartaoSUS;

	private String email;

	private String telefone;

	private String profissao;

	private String comorbidade;

	private int idade;

	private EstadoVacinacao estado;

	public Pessoa(String nome, String cpf, String endereco, String cartaoSUS, String email, String telefone,
			String profissao, String comorbidade, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cartaoSUS = cartaoSUS;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.comorbidade = comorbidade;
		this.idade = idade;
		this.estado = new NaoVacinada();

	}

	public void atualizaEstadoVacina(Pessoa pessoa) {
		estado.alteraEstado(pessoa);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCartaoSUS() {
		return cartaoSUS;
	}

	public void setCartaoSUS(String cartaoSUS) {
		this.cartaoSUS = cartaoSUS;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getComorbidade() {
		return comorbidade;
	}

	public void setComorbidade(String comorbidade) {
		this.comorbidade = comorbidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public EstadoVacinacao getSituacao() {
		return estado;
	}

	public void setEstadoVacinacao(EstadoVacinacao estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", cartaoSUS=" + cartaoSUS
				+ ", email=" + email + ", telefone=" + telefone + ", profissao=" + profissao + ", comorbidade="
				+ comorbidade + ", idade=" + idade + ", estado=" + estado + "]";
	}

	public void alteraDado(String dado, String novo) {
		if (dado == "nome") {
			this.nome = novo;
			System.out.println("Nome alterado com sucesso.");
		}
		else if (dado == "cpf") {
			this.cpf = novo;
			System.out.println("Cpf alterado com sucesso.");
		}
		else if (dado == "endereco") {
			this.endereco = novo;
			System.out.println("Endereço alterado com sucesso.");
		}
		else if (dado == "cartao do sus") {
			this.cartaoSUS = novo;
			System.out.println("Cartão do SUS alterado com sucesso.");
		}
		else if (dado == "email") {
			this.email = novo;
			System.out.println("Email alterado com sucesso.");
		}
		else if (dado == "telefone") {
			this.telefone = novo;
			System.out.println("Telefone alterado com sucesso.");
		}
		else if (dado == "profissao") {
			this.profissao = novo;
			System.out.println("Profissão alterada com sucesso.");
		}
		else if (dado == "comorbidade") {
			this.comorbidade = novo;
			System.out.println("Comorbidade alterada com sucesso.");
		}
		else if (dado == "idade") {
			int idade = Integer.parseInt(novo);
			this.idade = idade;
			System.out.println("Idade alterada com sucesso.");
		}else{
			System.out.println("Opção inválida.");
		}

	}

}
