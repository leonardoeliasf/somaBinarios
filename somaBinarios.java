package application;

import java.util.Locale;
import java.util.Scanner;

public class somaBinarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			
			int n, i, carry, sum;
			
			System.out.print("How many bytes the number will have? ");
			n = sc.nextInt();
			System.out.println();
			
			int[] A = new int[n];
			
			System.out.println("Enter the digital numbers of A: ");
			
			for (i = 0; i < A.length; i++) {
				System.out.print("A[" + i + "]: ");
				A[i] = sc.nextInt();
			}
			
			int[] B = new int[n];
			
			System.out.println("\nEnter the digital numbers of B: ");
			
			for (i = 0; i < A.length; i++) {
				System.out.print("B[" + i + "]: ");
				B[i] = sc.nextInt();
			}
			
			int[] C = new int[n + 1];
	        carry = 0;

	        for (i = n - 1; i >= 0; i--) {
	            sum = A[i] + B[i] + carry;
	            C[i + 1] = sum % 2;
	            carry = sum / 2;
	        }

	        C[0] = carry;
			
	        System.out.print("\nBinary sum result: ");
	        for (i = 0; i < C.length; i++) {
	            System.out.print(C[i] + " ");
	        }
			
			
			
		}

	}

}
