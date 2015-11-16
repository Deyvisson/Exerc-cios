import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int idade = 0;
		
		for(idade = 0; idade < 11; idade++){
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Digite a sua idade");
			int idade1 = in.nextInt();
			
			if(idade1 >= 18 && idade1 < 100 ){
				System.out.println("Voce é Maior idade:  " + idade1);
			}else{
				if(idade1 < 18){
				System.out.println("Voce é Menor de idade:  "+ idade1);
				}else{
					System.out.println("Idade mairo que 100 nao entra no sistemas");
				}
			}
		}

	}

}
