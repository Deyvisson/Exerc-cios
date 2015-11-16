

public class Vip extends Ingreço{

	
	private double valorAdicional;
	
	
	void imprimeValor(){
		System.out.println("O valor do ingreço é:  "+ getValor()+ "$");
		System.out.println("O valor adicional é:  "+ getValorAdicional()+ "$");
		
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	
	
}
