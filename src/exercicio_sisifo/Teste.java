package exercicio_sisifo;

public class Teste {

	// Classe para testes
	public static void main(String[] args) {
		Sisifo sisifo = new Sisifo("Sisifo", 30, 100);
		Pedra pedra = new Pedra(80);
		Monte monte = new Monte(50, 90);
		
		System.out.println("Iniciando a tarefa de Sísifo...");
		
		boolean sucesso = monte.atingirTopo(sisifo, pedra);
		
		if (sucesso) {
			System.out.println("Sísifo conseguiu empurrar a pedra até o topo!");
		} else {
			System.out.println("Sísifo falhou, a pedra rolou de volta!");
		}

	}

}
