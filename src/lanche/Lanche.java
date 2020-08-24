package lanche;

public abstract class Lanche {
	private double preco;
	private int tempoPreparo, tempoTotal;
	private String[] ingredientes = new String[10];
	
	public int calculaTempo(int distancia) {
		return tempoTotal = tempoPreparo + distancia*10;
	}
	
	public double calculaPreco(double preco) {
		return 0.9*tempoTotal;
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(int t) {
		this.tempoPreparo = t;
	}

	public int getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
}