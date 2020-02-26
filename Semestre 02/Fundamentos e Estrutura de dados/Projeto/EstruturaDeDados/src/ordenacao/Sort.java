package ordenacao;

public abstract class Sort {
    
    public void print(int array[]){
        int tam = array.length;

        for (int i = 0; i < tam; i++){
            if(i == tam-1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println(".");
    }
    
    public void print(String array[]){
        int tam = array.length;

        for (int i = 0; i < tam; i++){
            if(i == tam-1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println(".");
    }
    
    
}
