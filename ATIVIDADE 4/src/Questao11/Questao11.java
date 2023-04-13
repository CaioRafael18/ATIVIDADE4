package Questao11;

public class Questao11 {
        int[] A = {1,2,3,4,5,6,7,8,9,10}; 
        int count = 0; 
        
        public Questao11(){
            for(int i = 0; i < A.length; i++) {
                if(A[i] % 2 == 0) { // Verificando se o elemento é par
                    count++; // Incrementando o contador se o elemento for par
                }
            }
        }

        public void mostrar(){
            System.out.println("A quantidade de elementos pares é: " + count); // Escrevendo a quantidade de elementos pares
        }
}