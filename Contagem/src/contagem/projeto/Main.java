package contagem.projeto;

import  java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite até que número (inteiro) a lista deve ir: ");
		int input2 = input.nextInt();
		int input3 = 0;
		while(input3 <= input2){
			System.out.println(input3);
			input3++;
		}
	}
		
	}