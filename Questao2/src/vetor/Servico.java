package vetor;

public class Servico {

	public int somar(int[] v) {
		int somar = 0;
		for (int i = 0; i < v.length; i++) {
			somar += v[i];
		}

		return somar;

	}

}