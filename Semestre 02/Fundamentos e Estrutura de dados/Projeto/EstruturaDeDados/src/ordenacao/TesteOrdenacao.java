package ordenacao;


public class TesteOrdenacao {
    public static void main(String[] args) {
        

        int[] vetor = {2, 60, 5, 27, 8};
        
        InsertSort b = new InsertSort();
        b.print(vetor);
        
        b.insertSort(vetor);
        b.print(vetor);
    }
}
