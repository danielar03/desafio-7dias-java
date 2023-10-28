package Exercicios;

import java.util.Arrays;

public class Ex9 {
	
    public static void main(String[] args) {
        int[] colunaArray = {00, 11, 22, 33, 44, 55, 66};
        int lugarDaPosicao = 5;
        int valorVerdadeiro = 5;

        System.out.println("Coluna principal do array: " + Arrays.toString(colunaArray));

        for (int i = colunaArray.length - 1; i > lugarDaPosicao; i--) {
        	colunaArray[i] = colunaArray[i - 1];
        }
        colunaArray[lugarDaPosicao] = valorVerdadeiro;

        System.out.println("Nova coluna do array: " + Arrays.toString(colunaArray));
    }
}