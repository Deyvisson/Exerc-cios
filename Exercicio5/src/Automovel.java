
public class Automovel extends Veiculo{

	private String cor;
	private String ano;
	private String placa;
		
	@Override
	void acelera() {
		// TODO Auto-generated method stub
		System.out.println("Acelera");
		
	}

	@Override
	void freia() {
		// TODO Auto-generated method stub
		System.out.println("freia");
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	

}
