
public class NovoImovel extends Imovel{
	
	private int valorAdicional;
	
	void valorAdicional (){
		
		System.out.println("O nome do Imovel �:  "+ getImovel());
		System.out.println("O valor o Imovel �:  "+ getPre�o());
		System.out.println("O valor Adicional � "+ getValorAdicional());
		
			
		
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(int valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

}
