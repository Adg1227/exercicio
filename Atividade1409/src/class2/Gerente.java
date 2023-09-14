package class2;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    private List<Funcionario> subordinados;

    

public Gerente(String nome, int identificacao, double salario) {
        super(nome, identificacao, salario);
        
       
this.subordinados = new ArrayList<>();
    }

       
   
public List<Funcionario> getSubordinados() {
        return subordinados;
    }
    
   
public void setSubordinados(List<Funcionario> subordinados) {
        
       
this.subordinados = subordinados;
    }
  

    public double getSalario() {
        return super.getSalario() + (subordinados.size() * 100.0);
    }

    public String getNome() {
         
    	return "*" + super.getNome();
    	}
}
   