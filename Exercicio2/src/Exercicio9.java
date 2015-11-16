
public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valordocarro = 35.000;
		int anoCarro = 2000;  // ALTERE O ANO 
		
		if (anoCarro == 2000){
			System.out.println("Valor do Carro é:  " + valordocarro / 0.12);
		}else{
			if(anoCarro >200 && anoCarro < 2005 ){
				System.out.println("Valor do Carro é:  " + valordocarro / 0.7 );
			}else{
				if(anoCarro >= 2005){
					System.out.println("Valor do Carro é:  " + valordocarro / 0.5);
				}
			}
			
		}
		
	

	}

}
