package ordenacao;

import javax.swing.JOptionPane;

public class TesteOrdenacaoString {
     public static void main(String[] args) {
        
        String[] vetor = new String[10];
        String[] vetorB = new String[10];
        String[] vetorI = new String[10];
        String[] vetorS = new String[10];
        
        for (int i = 0; i < vetor.length; i++){
            String aux;
            aux = JOptionPane.showInputDialog(null, "Digite uma String");
            vetor[i] = aux;
            vetorB[i] = aux;
            vetorI[i] = aux;
            vetorS[i] = aux;
        }
        
        BubbleSort b = new BubbleSort();
        InsertSort i = new InsertSort();
        SelectSort s = new SelectSort();
        System.out.println("Vetor Original é: ");
        b.print(vetor);
        System.out.println("O novo vetor processado por BubbleSort é: ");
        b.bubbleSort(vetorB);
        b.print(vetorB);
        
        System.out.println("Vetor Original era: ");
        i.print(vetor);
        System.out.println("O novo vetor processado por InsertSort é: ");
        i.insertSort(vetorI);
        i.print(vetorI);
        
        System.out.println("Vetor Original era: ");
        s.print(vetor);
        System.out.println("O novo vetor processado por SelectSort é: ");
        s.selectSort(vetorS);
        s.print(vetorS);
    }
}
