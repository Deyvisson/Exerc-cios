import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			Scanner in = new Scanner(System.in);
			
			double soma;
			double divisao;
			double multip;
			double subtracao;
			
			
			System.out.println("Insira um numero");
			double num1 = in.nextDouble();
			

			System.out.println("Insira outro numero");
			double num2 = in.nextDouble();
			
			
			
			soma = num1 + num2;
			System.out.println("A soma �:  " + soma);
			
			divisao = num1 / num2;
			System.out.println("A Divis�o �:  " + divisao);
			
			multip = num1 * num2;
			System.out.println("A Multiplica��o �:  " +  multip);
			
			subtracao = num1 - num2;
			System.out.println("A Subtra��o �:  " + subtracao);
			
			if(soma == 0.0  ){
				System.out.println(" A soma esta com erro");
			}else
				if (divisao == 0.0){
					System.out.println("A divisao esta com erro");
				}else
					if(subtracao == 0.0){
						System.out.println("A subtra��o esta com erro");
					}else	
						if(multip == 0.0){
							System.out.println("A multiplica��o esta com erro");
						}
			

		}

}
