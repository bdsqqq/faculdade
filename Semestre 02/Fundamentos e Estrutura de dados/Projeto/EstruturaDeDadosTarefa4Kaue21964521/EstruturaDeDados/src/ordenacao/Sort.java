package ordenacao;

public abstract class Sort {
    
    public static void print (int vetor[]){
        int tam = vetor.length;
        
        System.out.print("[");
        for (int i = 0; i < tam ; i++){
            System.out.print(vetor[i] + ", ");            
        }
        System.out.println("]");
    }
}
