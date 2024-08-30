package br.com.rogersantos;

import java.util.Scanner;

public class Wrapper {	
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
	    int idade = s.nextInt();
		
	    System.out.println("O valor primitivo digitado foi: " + idade);
	    
	    Integer idadeWrapper = Integer.valueOf(idade);
	    System.out.println("Valor primitivo convertido para wrapper: " + idadeWrapper);
	}

}
