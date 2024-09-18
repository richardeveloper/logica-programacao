package br.com.estruturas.sequencial;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		System.out.println("Tabuada de " + num);
		System.out.println();
		System.out.println(num+" x 0 = " + num*0);
		System.out.println(num+" x 1 = " + num*1);
		System.out.println(num+" x 2 = " + num*2);
		System.out.println(num+" x 3 = " + num*3);
		System.out.println(num+" x 4 = " + num*4);
		System.out.println(num+" x 5 = " + num*5);
		System.out.println(num+" x 6 = " + num*6);
		System.out.println(num+" x 7 = " + num*7);
		System.out.println(num+" x 8 = " + num*8);
		System.out.println(num+" x 9 = " + num*9);
		System.out.println(num+" x 10 = " + num*10);
	
		input.close();
	}
}
