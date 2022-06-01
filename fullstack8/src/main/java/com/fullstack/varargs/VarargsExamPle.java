package com.fullstack.varargs;

public class VarargsExamPle {

	public static void main(String[] args) {
		

		System.out.println(soma(32, 59, 69));
		
		int[] vetor = {1, 2, 3, 4, 5};
		System.out.println(vtn(vetor));		
		

		System.out.println(vararg(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}
	
	
	

	// normal
	static int soma(int a, int b, int c) {
		return a * b * c;
	}
	

	// vetor normal
	static int vtn(int[] vetor) {

		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}

		return total;
	}
	
	

	// Varargs
	static int vararg(Integer... vetor) {

		int total = 0;

		for (int i = 0; i < vetor.length; i++) {

			total += vetor[i];
		}
		  return total;
	}

}
