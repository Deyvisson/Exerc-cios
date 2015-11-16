
public class VelhoImovel extends Imovel{
	
	private String imovel;
	private int preço;
	private int desconto = preço - 30;
	
	
	void velho (){
		
		System.out.println("O nome do Imovel é:  "+ getImovel());
		System.out.println("O valor o Imovel é:  "+ getPreço());
		System.out.println("O descoto é de 30% =  " + getDesconto());
			
		
	}
	
	
	
	boolean aplicaDescontoNoImovel(int preço){
		if (preço > 0.1){
			return false;
		}else{
		setPreço(getPreço() - (getPreço() * preço));
		return true;
		}
		
	}


	public String getImovel() {
		return imovel;
	}


	public void setImovel(String imovel) {
		this.imovel = imovel;
	}


	public int getPreço() {
		return preço;
	}


	public void setPreço(int preço) {
		this.preço = preço;
		
		
	}



	public int getDesconto() {
		return desconto;
	}



	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
}
