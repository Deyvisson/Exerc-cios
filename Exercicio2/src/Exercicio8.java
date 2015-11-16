

public class Exercicio8 {
	
	public static void main (String[]args){
		String jaken_pow = "Papel";
		String p1 = "Pedra";
		String p2 = "Papel";
		String t1 = "Tesoura";
		
		
		if(p1 == jaken_pow && p2 != jaken_pow && t1 != jaken_pow ){
						
			System.out.println("Deu empate");
		}else{
			if(p2 == jaken_pow && p1 != jaken_pow && t1 != jaken_pow ){
				System.out.println("Papel vence");
				
			}else{
				if(t1 == jaken_pow && p1 != jaken_pow && p2 != jaken_pow){
					System.out.println("Tesoura vence");
					
				}
			}
		}
		
		
	}

	
}


