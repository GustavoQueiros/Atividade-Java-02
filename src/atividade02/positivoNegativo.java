package atividade02;

import java.util.Scanner;

public class positivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nu1;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o número");
		nu1 = leia.nextFloat();
		if (nu1 % 2 == 0) {
			System.out.println("O número é par");
		}else {
				System.out.println("O número é impar");
			}
		if ( nu1 < 0) {
			System.out.println("O número é negativo");
			
		}else {
				System.out.println("O númeo é positivo ");
		}
			
		}
		
		
	}


