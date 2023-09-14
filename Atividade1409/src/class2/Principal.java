package class2;

public class Principal {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Funcionario Prestativo", 1233243, 2313162);
		Funcionario f2 = new Funcionario("Funcionario Inconpetente", 13345, 2313165);
		Funcionario f3 = new Funcionario("Funcionario Esforcado", 12343, 231312);
		
		Vendedor v1 = new Vendedor("Vendedor Abusado", 1233243, 2313162);
		Vendedor v2 = new Vendedor("Vendedor Enrrolado", 1233243, 2313162);
		Vendedor v3 = new Vendedor("Vendedor Desenrrolado", 1233243, 231244);
		
		Gerente g1 = new Gerente ("Gerente exemplar", 23455,223238);
		Gerente g2 = new Gerente ("Gerente bonzinho", 12455,322345);
		Gerente g3 = new Gerente ("Gerente chato",12345,123455);

System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Informacoes sobre Funcionarios:");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Nome: " + f1.getNome() + ", Identificacao : " + f1.getIdentificacao() + ", Salario: " + f1.getSalario());
System.out.println("Nome: " + f2.getNome() + ", Identificacao : " + f2.getIdentificacao() + ", Salario: " + f2.getSalario());
System.out.println("Nome: " + f3.getNome() + ", Identificacao : " + f3.getIdentificacao() + ", Salario: " + f3.getSalario());
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Informacoes sobre Vendedores:");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Nome: " + v1.getNome() + ", Identificacao : " + v1.getIdentificacao() + ", Salario: " + v1.getSalario());
System.out.println("Nome: " + v2.getNome() + ", Identificacao : " + v2.getIdentificacao() + ", Salario: " + v2.getSalario());
System.out.println("Nome: " + v3.getNome() + ", Identificacao : " + v3.getIdentificacao() + ", Salario: " + v3.getSalario());
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Informacoes sobre Gerentes:");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Nome: " + g1.getNome() + ", Identificacao : " + g1.getIdentificacao() + ", Salario: " + g1.getSalario());
System.out.println("Nome: " + g2.getNome() + ", Identificacao : " + g2.getIdentificacao() + ", Salario: " + g2.getSalario());
System.out.println("Nome: " + g3.getNome() + ", Identificacao : " + g3.getIdentificacao() + ", Salario: " + g3.getSalario());  





}
}