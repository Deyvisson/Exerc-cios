
public class AssistenteTecnico extends Funcionario{
	
	private int matricula;
	private double bonusSalarial;
	
	
	
	void exibeDados(){
		
		System.out.println("A sua marticula:  "+ getMatricula());
		System.out.println("o Bonus � de:  "+ getBonusSalarial());
		System.out.println("O nome do Funcionario �:  "+ getNomeFuncionario());
		System.out.println("O seu CPF:  "+ getCpf());
		System.out.println("O seu cargo:  "+ getCargo());
		System.out.println("------------------");
		
		
	}



	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



	public double getBonusSalarial() {
		return bonusSalarial;
	}



	public void setBonusSalarial(double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}

}
