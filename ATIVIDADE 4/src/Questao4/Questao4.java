package Questao4;

import java.util.Arrays;

public class Questao4 {
    private double[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    private double[] B;

    public Questao4(){
        this.B = new double[this.A.length];
        for(int i=0; i < A.length; i++){
            B[i] = Math.sqrt(A[i]);
        }
    }
    
    public void mostrar(){
        System.out.println("Vetor A:" + Arrays.toString(A));
        System.out.println("Vetor B:" + Arrays.toString(B));
    }
}
