
public class Professor {
	
	private String nomeProfessor;
	private int dataAdimissao;
	private String departatamento;
	private int numeroRegistro;
	
	void detalhesProf() {
		
		System.out.println("Detalhes do Professor");
		System.out.println("Nome Professor:  " + nomeProfessor);
		System.out.println("Data de Admissão:  " + dataAdimissao);
		System.out.println("Departamento:  " + departatamento);
		System.out.println("Numero do Registro:  " + numeroRegistro);
		
		
		
	}
	
	
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public int getDataAdimissao() {
		return dataAdimissao;
	}
	public void setDataAdimissao(int dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
	}
	public String getDepartatamento() {
		return departatamento;
	}
	public void setDepartatamento(String departatamento) {
		this.departatamento = departatamento;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
		
	public static void main (String [] args){
		
		Data data = new Data();
		data.setAno(2014);
		data.setMes(06);
		data.setDia(25);
		
		
	}

}
