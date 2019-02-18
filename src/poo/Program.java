package poo;

public class Program extends Motorista {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		c1.setChassi("GolG90");
		c1.setPlaca("Gui2014");
		c1.setCor("Branca");
		c1.setModelo("Quadrado");

		Motorista m1 = new Motorista();
		m1.setNome("Bine");
		m1.setCpf("53472457672");
		m1.setIdentidade(871776);
		m1.setIdade(34);
		m1.setSexo("Feminino");
		m1.setCarro(c1);

		System.out.println("Motorista: " + m1.getNome());
		System.out.println("CPF: " + m1.getCpf());
		System.out.println("Identidade: " + m1.getIdentidade());
		System.out.println("Idade: " + m1.getIdade());
		System.out.println("Sexo: " + m1.getSexo());
		System.out.println("Chassi: " + m1.getCarro().getChassi());
		System.out.println("Placa: " + m1.getCarro().getPlaca());
		System.out.println("Cor: " + m1.getCarro().getCor());
		System.out.println("Modelo: " + m1.getCarro().getModelo());
	}
}
