
public class VelhoImovel extends Imovel{
	
	private String imovel;
	private int pre�o;
	private int desconto = pre�o - 30;
	
	
	void velho (){
		
		System.out.println("O nome do Imovel �:  "+ getImovel());
		System.out.println("O valor o Imovel �:  "+ getPre�o());
		System.out.println("O descoto � de 30% =  " + getDesconto());
			
		
	}
	
	
	
	boolean aplicaDescontoNoImovel(int pre�o){
		if (pre�o > 0.1){
			return false;
		}else{
		setPre�o(getPre�o() - (getPre�o() * pre�o));
		return true;
		}
		
	}


	public String getImovel() {
		return imovel;
	}


	public void setImovel(String imovel) {
		this.imovel = imovel;
	}


	public int getPre�o() {
		return pre�o;
	}


	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
		
		
	}



	public int getDesconto() {
		return desconto;
	}



	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
}
