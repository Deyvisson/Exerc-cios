
public class Porta {
	
	private String aberta;
	private String cor;
	private int dimensaoZ;
	private int dimensaoY;
	private int dimensaoX;
	
	void portaAberta(){
		System.out.println("A porta esta aberta");
		
	}
	
	void portaFechada(){
		System.out.println("A porta esta fechada");
	}
	
	boolean estaAberta(){
		if (estaAberta()){
			return true;
		}else{
			System.out.println("Esta fechada");
			return false;
		}
	}

	public String getAberta() {
		return aberta;
	}

	public void setAberta(String aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(int dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	public int getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(int dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public int getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(int dimensaoX) {
		this.dimensaoX = dimensaoX;
	}
	
	void mostraDetalhesDaporta(){
		
		System.out.println("Cor da porta:  "+ cor);
		System.out.println("A prota esta Berta ?:  "+ aberta);
		System.out.println("Dimensões:  " + dimensaoX);
		System.out.println("Dimensões:  " + dimensaoY);
		System.out.println("Dimensões:  " + dimensaoZ);
	}
	
	public static void main (String [] args){
		
		Porta porta = new Porta();
		
		porta.portaFechada();
		
		porta.setAberta("Sim");
		porta.setCor("Branca");
		porta.setDimensaoX(34);
		porta.setDimensaoY(54);
		porta.setDimensaoZ(45);
		porta.mostraDetalhesDaporta();
		
		
		
	}

}
