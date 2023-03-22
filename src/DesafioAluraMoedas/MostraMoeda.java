package DesafioAluraMoedas;

public class MostraMoeda {

	public static void main(String[] args) {
		double conversorMoeda = ConversorDeMoedas.ConversorDeMoedas(1, Moeda.BRL, Moeda.USD);
		System.out.println(conversorMoeda);
	}
}
