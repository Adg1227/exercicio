package class2;

public class Vendedor extends Funcionario {

	public Vendedor(String nome,int identificacao,double salario) {
			super(nome,identificacao,salario);
	
	}
	
	private float valorDasVendas;
	
	public double getSalario() {
		return(super.getSalario() + (valorDasVendas*0.05f));
		
	}
	
		public float getValorDasVendas() {
			return valorDasVendas; }
		
	public void setValorDasVendas(float valorDasVendas) {
		this.valorDasVendas = valorDasVendas;
	}

}
