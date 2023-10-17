package desafio;

public class Ex2 {

	public static void main(String[] args) {
		
		        int[] numerosDoArray = { 3, 4, 9, 23, 33, 77 };
		       
		        int somaDosNumeros = 0;
		    
		        for (int i = 0; i < numerosDoArray.length; i++) {
		            somaDosNumeros += numerosDoArray[i];
		        }
		        
		        System.out.println("A soma dos numeros escolhidos para o array é: " + somaDosNumeros);
		    }
		}
