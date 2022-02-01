package exerciciosJavaGeneration6;

import java.util.Scanner;

public class TestaAnimal {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do cachorro: ");
		String nome = leia.next();
		System.out.println("Digite a idade do cachorro: ");
		int idade = leia.nextInt();
		System.out.println("Qual som o cachorro emite: ");
		String emitirSom = leia.next();
		
		Animal cachorro = new Animal();
		
		cachorro.setNome(nome);
		cachorro.setIdade(idade);
		cachorro.setEmitirSom(emitirSom);
		System.out.println();
		
		System.out.println("Digite o nome do cavalo: ");
		String nome2 = leia.next();
		System.out.println("Digite a idade do cavalo: ");
		int idade2 = leia.nextInt();
		System.out.println("Qual som o cavalo emite: ");
		String emitirSom2 = leia.next();
		
		Animal cavalo = new Animal();
		
		cavalo.setNome(nome2);
		cavalo.setIdade(idade2);
		cavalo.setEmitirSom(emitirSom2);
		System.out.println();
		
		System.out.println("Digite o nome do Preguiça: ");
		String nome3 = leia.next();
		System.out.println("Digite a idade do Preguiça: ");
		int idade3 = leia.nextInt();
		System.out.println("Qual som o Preguiça emite: ");
		String emitirSom3 = leia.next();
		
		Animal preguica = new Animal();
		
		preguica.setNome(nome3);
		preguica.setIdade(idade3);
		preguica.setEmitirSom(emitirSom3);
		System.out.println();
		
		System.out.println("Nome do cachorro: " + cachorro.getNome());
		System.out.println("Idade do cachorro: " + cachorro.getIdade());
		System.out.println("Som que o cachorro emite: " + cachorro.getEmitirSom());
		System.out.println();
		System.out.println("Nome do cachorro: " + cavalo.getNome());
		System.out.println("Idade do cachorro: " + cavalo.getIdade());
		System.out.println("Som que o cachorro emite: " + cavalo.getEmitirSom());
		System.out.println();
		System.out.println("Nome do preguiça: " + preguica.getNome());
		System.out.println("Idade do preguiça: " + preguica.getIdade());
		System.out.println("Som que o preguiça emite: " + preguica.getEmitirSom());
		
		leia.close();
	}

}
