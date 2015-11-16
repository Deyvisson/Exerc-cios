
public class Quadrado {

	void area(double lado, double lado2){
		System.out.println(lado * lado2);
	}
	
	void perimetro(double lado){
		System.out.println(4 * lado);
	}
	
	public static void main (String [] args){
		
		Quadrado a = new Quadrado();
		a.area(20, 40); 
		
		a.perimetro(20);
		
	}
	
}
