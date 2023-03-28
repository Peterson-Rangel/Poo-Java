//Não pode instancial dessa classe, pq é abstrato.
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	// Construtor
	public Funcionario() {

	}
	
	//Significa que o método não tem corpo, sem implementação.
	public abstract double getbonificacao();
	
	
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}



//Publico para os filhos / herdeiros
//protected double salario;

