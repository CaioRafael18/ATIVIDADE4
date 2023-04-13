package Questao1;

import java.util.Arrays;

public class Questao1{
    private int[] A = {1,2,3,4,5};
    private int[] B;

    public Questao1(){
        this.B = new int[this.A.length];
        for(int i=0; i< A.length; i++){
            this.B[i] = this.A[i];
        }
    }
    

    public void mostrar(){
        System.out.println("Vetor A:" + Arrays.toString(this.A));
        System.out.println("Vetor B:" + Arrays.toString(this.B));
    }
}

