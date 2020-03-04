package ordenacao;

public class InsertSort extends Sort {
    
    public static long insertSort (int vetor[]) {
        int auxiliar;
        int tam = vetor.length;
        int j;
        long cont = 0;

        for (int i = 1; i < tam; i++) {
              auxiliar = vetor[i];
              j = i -1;
              
              while ( j >= 0 && auxiliar < vetor[j]){
                  vetor[j+1] = vetor[j];
                  j--;
              }
              if (vetor [j+1] != auxiliar){
                  cont++;
              }
              vetor[j+1] = auxiliar;
              
            

        }
        return cont;
    
   }
    
}

