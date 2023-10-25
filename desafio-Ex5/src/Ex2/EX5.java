package Ex2;

public class EX5 {
	    public static void main(String[] args) {
	    	
	        int[] numerosDoArray = {1, 2, 3, 4, 5}; 
	        int ProcurandoValor = 3; 
	        
	        boolean valorEncontrado = false; 
	        
	        for (int i = 0; i < numerosDoArray.length; i++) {
	            if (numerosDoArray[i] == ProcurandoValor) {
	            	valorEncontrado = true;
	                break; 
	            }
	        }
	        
	        if (valorEncontrado) {
	            System.out.println(" valor " + ProcurandoValor + " foi encontrado no array.");
	        } else {
	            System.out.println(" valor " + ProcurandoValor + " não foi encontrado no array.");
	        }
	    }
	}
