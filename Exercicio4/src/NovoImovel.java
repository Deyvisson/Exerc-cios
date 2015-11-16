
public class NovoImovel extends Imovel{
	
	private int valorAdicional;
	
	void valorAdicional (){
		
		System.out.println("O nome do Imovel é:  "+ getImovel());
		System.out.println("O valor o Imovel é:  "+ getPreço());
		System.out.println("O valor Adicional é "+ getValorAdicional());
		
			
		
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(int valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

}
