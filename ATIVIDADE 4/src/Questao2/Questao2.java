package Questao2;

import java.util.Arrays;

public class Questao2{
    private int[] A = {1,2,3,4,5,6,7,8};
    private int[] B;

    public Questao2(){
        this.B = new int[this.A.length];
        for(int i=0; i < A.length; i++){
            B[i] = A[i] * 2;
        } 
    }

    public void mostrar(){
        System.out.println("Vetor A:" + Arrays.toString(A));
        System.out.println("Vetor B:" + Arrays.toString(B));
    }
    
}
        