
public class AssistenteADM extends Funcionario{
	
	private String turno;
	private int adicionalNoturno;
	private String nome;
	private int matricula;
	
	void exibeDados(){
		
		System.out.println("O turno é:  "+ getTurno());
		System.out.println("Adicional Noturno:  "+ getAdicionalNoturno() + "$");
		System.out.println("O nome é do Assistente ADM é:  "+  getNome());
		System.out.println(" A sua Matricula:  "+ getMatricula());
		System.out.println("------------------");
		
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(int adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	


}
