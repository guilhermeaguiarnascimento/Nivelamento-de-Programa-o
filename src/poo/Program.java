package poo;

public class Program extends Motorista {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.setChassi("GolG90");
		c1.setPlaca("Gui2014");
		c1.setCor("Branca");
		c1.setModelo("Quadrado");
	
		Motorista m1 = new Motorista ();
		m1.setNome("Bine");
		m1.setCpf("53472457672");
		m1.setIdentidade(871776);
		m1.setIdade(34);
		m1.setSexo("Femenino");
		m1.setCarro(c1);
		
		
		System.out.println(m1);
	}
	
	

}
