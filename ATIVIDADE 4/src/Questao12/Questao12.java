package Questao12;

public class Questao12 { 
    int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
    int soma = 0;

    public Questao12(){
         for (int i = 0; i < A.length; i++) {
             soma += A[i]; 
        }
    }

    public void mostrar(){
        System.out.println("A soma dos elementos do vetor é: " + soma); 
    }

}
       
