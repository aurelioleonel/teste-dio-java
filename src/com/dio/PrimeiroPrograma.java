package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		gato.setNome("Bichano");
		gato.setIdade(12);
		gato.setCor("Caramelo");
		
		System.out.println(gato);
		System.out.println(livros);
		
		
	}
	

	/*public static void main(String[] args) {
		int a = 2;
		int b = 4;
		System.out.println("Hello world! " + (a + b) +" "+ (a * b) );

	}*/

}

class Livros {
	private String nome;
	private String npag;
}