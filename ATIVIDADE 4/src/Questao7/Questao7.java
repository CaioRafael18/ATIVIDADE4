package Questao7;

import java.util.Arrays;

public class Questao7 {
    private int[] A = {1,2,3,4,5,6,7,8,9,10};
    private int[] B = {1,2,3,4,5,6,7,8,9,10};
    private int[] C;

    public Questao7(){
        this.C = new int[this.A.length];
        for(int i=0; i < A.length; i++){
            C[i] = A[i] - B[i];
        }
    }

    public void mostrar(){
        System.out.println("Vetor A:" + Arrays.toString(A));
        System.out.println("Vetor B:" + Arrays.toString(B));
        System.out.println("Vetor C:" + Arrays.toString(C));

    }

    
}
