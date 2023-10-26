package Exercicios;

public class Ex10 {
	
	    public static void main(String[] args) {
	        int[] numerosEscolhidos = {77, 88, 99, 00, 11, 22, 33, 44, 55, 66};
	        int maximoValor = numerosEscolhidos[0];
	        int minimoValor = numerosEscolhidos[0];

	        for (int j = 1; j < numerosEscolhidos.length; j++) {
	        	
	            if (numerosEscolhidos[j] > maximoValor) {
	            	maximoValor = numerosEscolhidos[j];
	            	
	            } 
	            else if (numerosEscolhidos[j] < minimoValor) {
	            	minimoValor = numerosEscolhidos[j]; 
	            }
	        }

	        System.out.println("Valor máximo é: " + maximoValor);
	        System.out.println("Valor mínimo é: " + minimoValor);
	    }
	}