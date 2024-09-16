package exercicio_sisifo;

public class Monte {
	private int altura;
	private int dificuldade;
	
	public Monte(int altura, int dificuldade) {
		this.altura = altura;
		this.dificuldade = dificuldade;
	}
	
	//Getters and Setters
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}
	
	// Método atingirTopo
	public boolean atingirTopo(Sisifo sisifo, Pedra pedra) {
		if (sisifo.getForca() > dificuldade) {
			System.out.println("Sisifo atigiu o topo!");
			return true;
		} else {
			pedra.rolar();
			return false;
		}
	}
}
