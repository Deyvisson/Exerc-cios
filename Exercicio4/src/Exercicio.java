import java.util.Scanner;

public class Exercicio {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			
		AssistenteADM assistente = new AssistenteADM();
		assistente.setNome("Deyvisson Araujo");
		assistente.setMatricula(43543);
		assistente.setTurno("Manha");
		assistente.setAdicionalNoturno(250);
		assistente.exibeDados();
		
		AssistenteTecnico assistenteT = new AssistenteTecnico();
		assistenteT.setNomeFuncionario("Wanderson Alves");
		assistenteT.setBonusSalarial(1000);
		assistenteT.setMatricula(3453452);
		assistenteT.setCargo("TI");
		assistenteT.setCpf("091.002.345.43");
		assistenteT.exibeDados();
		
		
		
		
		System.out.println("Digite 1 para Ingreço normal ou 2 para vip");
		int ingreço = in.nextInt();
		
		if(ingreço == 1){
			
			Normal normal = new Normal();
			normal.ingreçoNormal();
			
			Ingreço ingreço1 = new Ingreço();
			ingreço1.setValor(500);
			ingreço1.imprimeValor();
		}else{
			if(ingreço == 2){
				
				Vip vip = new Vip();
				vip.setValor(500);
				vip.setValorAdicional(400);
				vip.imprimeValor();
				
			}else{
				System.out.println("Erro digite 1 ou 2");
			}
			
		}
		System.out.println("---------------------");
		
		System.out.println("Digite 1 para imovel novo ou 2 para imovel velho");
		int imovel = in.nextInt();
		
		if(imovel == 1){
			
			NovoImovel novo = new NovoImovel();
			novo.setImovel("Residencial Vila verde");
			novo.setPreço(60000);
			novo.setValorAdicional(1000);
			novo.valorAdicional();
			
		}else{
			if(imovel == 2){
				
				VelhoImovel velho = new VelhoImovel();
				velho.setImovel("Beco do Mijo");
				velho.setPreço(30000);
				velho.getDesconto();
				velho.velho();
			}else{
				System.out.println("Erro digite 1 ou 2");
			}
		}
	}
}

