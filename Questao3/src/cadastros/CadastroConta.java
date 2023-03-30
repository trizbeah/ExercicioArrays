package cadastros;

import java.util.Arrays;

import basica.Conta;

public class CadastroConta {

	Conta[] conta = new Conta[5];
	int total = 0;

	public void adicionar(Conta c) {
		conta[this.total] = c;
		this.total++;

	}

	public void adicionarPorPosicao(int posicao, Conta cc) {
		if (!verificaPosicao(posicao)) {

			throw new IllegalArgumentException("posição inválida!");

		}
		for (int i = this.total - 1; i >= posicao;i--) {

			this.conta[i + 1] = this.conta[i];

		}

		this.conta[posicao] = cc;

		this.total++;

	}

	public void listar() {

		System.out.println(Arrays.toString(this.conta));

	}

	public Conta procurarPosicao(int p) {

		if (!verificaPosicao(p)) {

			throw new IllegalArgumentException("posição inválida!");
		}

		return this.conta[p];
	}

	public Conta procurarNome(String nome) {
		Conta c = null;

		for (int i = 0; i < this.total; i++) {
			if (nome.equalsIgnoreCase(this.conta[i].getNome())) {
				c = this.conta[i];
			}

		}

		return c;
	}

	private boolean verificaPosicao(int posicao) {
		return posicao >= 0 && posicao <= this.total;
	}

}