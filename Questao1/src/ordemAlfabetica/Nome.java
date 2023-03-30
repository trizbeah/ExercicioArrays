package ordemAlfabetica;

import java.util.Arrays;
import java.util.Scanner;

public class Nome {
	private String[] nome;
	
	public void lerNome() {
		
		Scanner scan = new Scanner (System.in);
		nome =  new String [10];
		
		for (int i = 0; i <nome.length; i++) {
			
			System.out.println("Digite 10 nome: ");
			nome[i] = scan.nextLine();
		}
		
		scan.close();
	}

		public void ordenarNome() {
			Arrays.sort(nome);
		}
		
		public void imprimirNomes() {
			System.out.println("Nomes em ordem alfbética: ");
			for (int i = 0; i <nome.length; i++) {
				System.out.println(nome[i]);
			}
			
		}
}
