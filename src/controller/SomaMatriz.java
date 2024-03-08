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

	private void somaLinha() {
		int soma = 0;
		for(int i = 0; i < 5; i++) {
			soma += linha[i];
		}
		System.out.println("A soma da linha " + (getId() - 14) + " é: " + " " + soma);
	}
}
