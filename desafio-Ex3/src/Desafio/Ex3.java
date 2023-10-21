package Desafio;

public class Ex3 {

	public static void main(String[] args) {
		// 10 por 10
		
		int [][] n = new int [10][10];
		  for (int i = 0; i<10; i++) {
			  for(int j = 0; j<10; j++) {
				  System.out.printf("%2d", n [i][j]);
			  }
			  System.out.println();
		  }

	}
}