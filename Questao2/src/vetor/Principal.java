package vetor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Servico s = new Servico();

		int[] n = new int[10];

		for (int i = 0; i < n.length; i++) {

			n[i] = scan.nextInt();

		}

		System.out.println(s.somar(n));
		
		scan.close();

	}

}
