import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a sua Nota");
		int nota = in.nextInt();
		
		if( nota >= 7){
			System.out.println("Passou Direto");
		}else {
			if( nota >5 && nota < 7){
				System.out.println("Recuperação");
			}else{
				System.out.println("REPROVADO !! VAI ESTUDAR SAFADO");
			}
		}

	}

}
