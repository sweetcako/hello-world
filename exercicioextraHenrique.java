import java.util.Scanner;

public class exercicioextraHenrique {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("qual o nome do Candidato1 : ");
		String candidato1 = input.next();
		
		System.out.println("qual o nome do Candidato2 : ");
		String candidato2 = input.next();
		
		System.out.println("Quantos eleitores votaram nessa sessão : ");
		int eleitores = input.nextInt();
		
		int votosC1 = 0;
		int votosC2 = 0;
		int votosNulos = 0;
			
		for(int v = 1 ; v<=eleitores; v++ ) {
			System.out.println("eleitor digite seu voto : ");
			String voto = input.next();
		
		if(voto.equals(candidato1)) {
			votosC1 = votosC1 + 1;
			
		}else if(voto.equals(candidato2)) {
			votosC2 = votosC2 + 1;
			
		}else {
		
			votosNulos = votosNulos + 1;
		   }
		
		}
		
		System.out.println("votos para" + candidato1 + ":" + votosC1);
		System.out.println("votos para" + candidato2 + ":" + votosC2);
		System.out.println("votos nulos : " + votosNulos);
		
		if(votosC1>votosC2) {
			System.out.println("O vencedor é : " + candidato1);
		}else if (votosC2>votosC1) {
			System.out.println("O vencedor é : " + candidato2);
		}else {
			System.out.println("empate");
		}
		
	}
}
