package exercicio_sisifo;

public class Sisifo extends Pessoa {
	private int forca;
	
	public Sisifo(String nome, int idade, int forca) {
		super(nome, idade);
		this.forca = forca;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public void empurrarPedra() {
		System.out.println("Sisifo usa sua força para empurrar a pedra.");
	}
}
