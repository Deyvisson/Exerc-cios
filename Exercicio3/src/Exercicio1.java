
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean lampada;
		boolean ligado = true;
		boolean desligado = false;
		
			lampada = ligado;
			System.out.println("A lampada esta ligada " + lampada);
			System.out.println();
			System.out.println();
			
			
			Professor cadastro = new Professor();
			cadastro.setNomeProfessor("Deyvisson Araujo");
			cadastro.setNumeroRegistro(11030299);
			cadastro.setDataAdimissao(25062010);
			cadastro.setDepartatamento("Direito");
			cadastro.detalhesProf();	
			

	}

}
