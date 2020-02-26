package ordenacao;

public class BubbleSort extends Sort {
    
    public void bubbleSort(int array[]){
        int aux;
        int tam = array.length;
        
        for (int i = 0; i < tam - 1; i++){
            
            for(int j = 0; j < tam - 1 - i; j++){

                if(array[j] > array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }
    
    public void bubbleSort(String array[]){
        String aux;
        int tam = array.length;
        
        for (int i = 0; i < tam - 1; i++){
            
            for(int j = 0; j < tam - 1 - i; j++){

                if(array[j].compareToIgnoreCase(array[j+1]) > 0){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }
}
