package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;


public class StampaNumeriDispari {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Inserisci il numero massimo: ");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		int odd = 0;
		int even = 0;
		int tot = 0;
		int max = 100;
		
		for (int i = 0; i < n; i++) {
			array[i] = r.nextInt(max+1);
			if (array[i] % 2 != 0) {
				System.out.println("Element position " + (i+1) + ": " + array[i]);
				odd++;
			}else {
				even++;
			}
			if (array[i] > 10 && array[i] < 50) {
				tot += array[i];
			}
		}
		
		System.out.println("\nI numeri dispari sono: " + odd + "\nI numeri pari sono: " + even + "\nLa somma dei numeri compresi tra 10 e 50 è: " + tot);
		
		scanner.close();

	}

}
