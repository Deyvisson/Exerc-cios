

public class Vip extends Ingre�o{

	
	private double valorAdicional;
	
	
	void imprimeValor(){
		System.out.println("O valor do ingre�o �:  "+ getValor()+ "$");
		System.out.println("O valor adicional �:  "+ getValorAdicional()+ "$");
		
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	
	
}
