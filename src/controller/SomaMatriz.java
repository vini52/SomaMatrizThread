package controller;

public class SomaMatriz extends Thread{

	int linha[] = new int[5];
	public SomaMatriz(int linha[]) {
		this.linha = linha;
	}
	
	@Override
	public void run() {
		somaLinha();
	}

	private int somaLinha() {
		int soma = 0;
		for(int i = 0; i < 5; i++) {
			soma += linha[i];
		}
		return soma;
	}
}
