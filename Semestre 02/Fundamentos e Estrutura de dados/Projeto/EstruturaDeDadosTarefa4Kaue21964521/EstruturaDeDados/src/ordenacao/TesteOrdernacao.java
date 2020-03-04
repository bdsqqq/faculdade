package ordenacao;

public class TesteOrdernacao {
    
    public static void main(String[] args) {
        int vetor[] = {34, 52, 24, 4, 13, 124};
        
        BubbleSort b = new BubbleSort();
        SelectSort s = new SelectSort();
        InsertSort i = new InsertSort();
        i.print(vetor);
        
        i.insertSort(vetor);
        i.print(vetor);
    }
}
