package atividade02;

import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner leia = new Scanner(System.in);
        float nu1, nu2, n3 = 0;
        int n5 ;
        n5 = 0;

        System.out.println("Digite o primeiro numero");
        nu1 = leia.nextFloat();
        System.out.println("Digite o segundo numero");
        nu2 = leia.nextFloat();
        System.out.println("Escolha o numero da operação");
        n5 = leia.nextInt();

        switch (n5) {
        case 1: n3 = nu1 + nu2;

        break;

case 2: n3 = nu1 - nu2;

    break;
case 3: n3 = nu1 * nu2;

break;
case 4: n3 = nu1 / nu2;

break;


default:System.out.println("Operação invalida ");
;


        }
System.out.println("O resultado da operação é: " + n3);

    }


}
		
	


