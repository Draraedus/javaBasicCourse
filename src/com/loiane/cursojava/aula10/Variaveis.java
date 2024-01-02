package com.loiane.cursojava.aula10;

public class Variaveis {
	  public static void main(String[] args) {

	    // Convenção java
	    int idade = 21;
	    String nome = "Adriel";
	    String nomeDoMeuCachorro = "Totó";
	    String ano2014 = "2014";

	    // Aceito mas não utilizado
	    int _idade;
	    int $idade;

	    // Não é convenção java
	    String nome_do_meu_cachorro;
	    String NomeDoMeuCachorro;
	    String nomeDoMeucachorro;

	    idade = 22;

	    System.out.println("Idade = " + idade);
	    System.out.println("Nome = " + nome);
	    
	    // Má prática
	    
	    int a = 10;
	    String b = "Loiane";
	  }
	}