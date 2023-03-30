package principal;

import basica.Conta;
import cadastros.CadastroConta;

public class Principal {

	public static void main(String[] args) {

		Conta c = new Conta("Bia", 10);
		Conta c1 = new Conta("Murilo", 15);
		Conta c2 = new Conta("Lua", 20);
		Conta c3 = new Conta("Carla", 25);

		CadastroConta cc = new CadastroConta();

		cc.adicionar(c);
		cc.adicionar(c1);
		cc.adicionar(c2);
		cc.adicionarPorPosicao(1, c3);
		cc.listar();

		System.out.println(cc.procurarPosicao(2));
		Conta conta = cc.procurarNome("Amanda");
		if (conta == null) {
			System.out.println("Conta não encontrada");

		} else {
			System.out.println(conta);
		}

		System.out.println();

	}

}
