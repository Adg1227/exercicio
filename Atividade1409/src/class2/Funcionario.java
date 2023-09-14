package class2;

public class Funcionario {
	private String nome;
	private int identificacao;
	private double salario;

	
	public Funcionario(String nome, int identificacao, double salario) {
		this.setNome(nome);
		this.setIdentificacao(identificacao);
		this.salario = salario;
	}

	public static void main(String[] args) {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public double getSalario() {
	
		return salario;
	}

}
