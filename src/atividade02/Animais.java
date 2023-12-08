package atividade02;

import java.util.Scanner;

public class Animais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner leia = new Scanner(System.in);
		
		String palavra1, palavra2, palavra3;
		
		
		System.out.println("Digite sua primeira palavra");
		palavra1 = leia.nextLine();
		
		System.out.println("Digite sua segunda palavra");
		palavra2 = leia.nextLine();
		
		System.out.println("Digite sua terceira palavra");
		palavra3 = leia.nextLine();
		
		if(palavra1.equals("vertebrado") ) {
			if(palavra2.equals("ave") ) {
				if(palavra3.equalsIgnoreCase("carnivoro") ) {
					System.out.println("águia");
					
				}	else {
					System.out.println("pomba");
				}
			} else {
				if(palavra3.equals("onivoro") ) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if(palavra2.equals("inseto") ) {
				if(palavra3.equals("hematofago") ) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} if(palavra2.equals("hematofago") ) {
				System.out.println("sanguessuga");
			} else {
				System.out.println("minhoca");
			}
		}
	}
	


		
	}


