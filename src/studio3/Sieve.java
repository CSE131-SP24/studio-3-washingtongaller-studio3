package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a value for n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	boolean[] sieve = new boolean[n];
	int primeValue = 2;
	
	
	while ( primeValue < n){
		if (!sieve[primeValue]) {
			System.out.println(primeValue);
			int currentValue = primeValue;
			while (currentValue < n) {
				sieve[currentValue] = true;
				currentValue = primeValue + currentValue; 
				
			}
		}
		primeValue = primeValue + 1;
	}
	
	
		
	}

}
