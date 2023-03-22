package DesafioAluraMoedas;

public class Moeda {
	
	private String nome;
	private String nomeCompleto;
	private double numero;
	
	

	public Moeda(String nome, String nomeCompleto, double numero) {
		
		this.nome = nome;
		this.nomeCompleto = nomeCompleto;
		this.numero = numero;
	}

	//Moedas
	
	public static Moeda BRL = new Moeda("BRL", "Brasil", 1.0);
	public static Moeda USD = new Moeda("USD", "Estados Unidos", 5.28);
	public static Moeda EUR = new Moeda("EUR", "União Europeia", 5.78);
	public static Moeda GBP = new Moeda("GBP", "Reino Unido", 6.43);
	public static Moeda ARS = new Moeda("ARS", "Aegentina", 0.259);
	public static Moeda CLP = new Moeda("CLP", "Chile", 0.007);
	public static Moeda[] MoedaAmostra = new Moeda[] {BRL, USD , EUR, GBP, ARS, CLP};
	
	
 // Getter & Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
}
