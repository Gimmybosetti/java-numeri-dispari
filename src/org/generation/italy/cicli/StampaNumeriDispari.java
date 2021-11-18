package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il numero massimo: ");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100);
			if (array[i] % 2 != 0) {
				System.out.println("Element position " + (i+1) + ": " + array[i]);
			}
		}
		
		scanner.close();

	}

}
