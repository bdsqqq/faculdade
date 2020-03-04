package ordenacao;

public class BubbleSort extends Sort {
    
    public static long bubbleSort (int vetor[]){
        int auxiliar;
        int tamanho = vetor.length;
        long cont = 0;
        
        //o primeiro for vai rodar 1 a menos
        for (int i = 0; i < tamanho - 1; i++){
            for (int j = 0; i < tamanho - 1 - j; j++){
                
                if (vetor[j] > vetor[j+1]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = auxiliar;
                    cont ++;
                }
            }
        }
   return cont;
           }
    
}
