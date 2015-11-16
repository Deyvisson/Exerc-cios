
public class Funcionario {
	
	private String nomeFuncionario;
	private String cpf;
	private String cargo;
	
	void exibeDados(){
		
		
		System.out.println("O nome do Funcionario é:  "+ nomeFuncionario);
		System.out.println("O seu CPF:  "+ cpf);
		System.out.println("O seu cargo:  "+ cargo);
		
		
	}
	
	
	
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	

}
