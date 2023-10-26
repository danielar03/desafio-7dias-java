package Exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
    	
        int[] array = {7, 9, 11, 13, 16, 19,};

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o elemento para que seja encontrado: ");
        int elementoEncontrar = scanner.nextInt();

        int indice = encontrarIndice(array, elementoEncontrar);

        if (indice != -1) {
            System.out.println("O elemento " + elementoEncontrar + " foi encontrado no índice " + indice + " do array.");
        } else {
            System.out.println("O elemento " + elementoEncontrar + " não foi encontrado.");
        }
    }

    public static int encontrarIndice(int[] array, int elementoEncontrar) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementoEncontrar) {
                return i;
            }
        }
        return -1;
    }
}
