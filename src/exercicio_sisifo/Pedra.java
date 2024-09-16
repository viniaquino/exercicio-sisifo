package exercicio_sisifo;

public class Pedra {
	private int peso;
	
	public Pedra(int peso) {
		this.peso = peso;
	}
	
	//Getters and Setters
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void rolar() {
		System.out.println("A pedra rolou de volta ao pé do monte...");
	}
}
