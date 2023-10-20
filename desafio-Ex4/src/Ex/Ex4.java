package Ex;

public class Ex4 {

	public static void main(String[] args) {
		
		        int[] numerosDoArray = { 3, 4, 9, 23, 33, 77 };
		        int somaDosNumeros = 0;
		        
		        for (int num : numerosDoArray) {
		            somaDosNumeros += num;
		        }
		        
		        double mediaDosNumerosArray = somaDosNumeros / (double) numerosDoArray.length;
		        
		        System.out.println("O valor médio dos elementos do array é: " + mediaDosNumerosArray);
	}

}