package ordenacao;

public class SelectSort extends Sort {
    
    public static long  selectSort (int vetor[]){
        int aux;
        int tam = vetor.length;
        long cont = 0;
        
        //o primeiro for vai rodar 1 a menos
        for (int i = 0; i < tam - 1; i++){
            
            for (int j = i + 1; j < tam; j++){
                
                if (vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                    cont ++;
                }
            }
        }
   return cont; }
}
