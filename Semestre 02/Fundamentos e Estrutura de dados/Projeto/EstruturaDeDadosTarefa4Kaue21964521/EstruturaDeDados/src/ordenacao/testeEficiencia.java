package ordenacao;

public class testeEficiencia {

    public static void main(String[] args) {
        int tam = 10000;

        int vetor[] = new int[tam];
        int vetorBubble[] = new int[tam];
        int vetorSelect[] = new int[tam];
        int vetorQuick[] = new int[tam];
        int vetorInsert[] = new int[tam];

        String tipoSort[] = {"BubbleSort", "SelectSort", "InsertSort", "QuickSort"};

        long trocasAleatorias[] = new long[4];
        long trocasOrdenadas[] = new long[4];

        long inicio[] = new long[4];
        long fim[] = new long[4];

        long inicioOrd[] = new long[4];
        long fimOrd[] = new long[4];

        for (int i = 0; i < tam; i++) {
            vetor[i] = (int) (Math.random() * 50000);
            vetorBubble[i] = vetor[i];
            vetorSelect[i] = vetor[i];
            vetorQuick[i] = vetor[i];
            vetorInsert[i] = vetor[i];
        }
        inicio[0] = System.currentTimeMillis();
        trocasAleatorias[0] = BubbleSort.bubbleSort(vetorBubble);
        fim[0] = System.currentTimeMillis();

        inicioOrd[0] = System.currentTimeMillis();
        trocasOrdenadas[0] = BubbleSort.bubbleSort(vetorBubble);
        fimOrd[0] = System.currentTimeMillis();

        inicio[1] = System.currentTimeMillis();
        trocasAleatorias[1] = SelectSort.selectSort(vetorSelect);
        fim[1] = System.currentTimeMillis();

        inicioOrd[1] = System.currentTimeMillis();
        trocasOrdenadas[1] = SelectSort.selectSort(vetorSelect);
        fimOrd[1] = System.currentTimeMillis();

        inicio[2] = System.currentTimeMillis();
        trocasAleatorias[2] = InsertSort.insertSort(vetorInsert);
        fim[2] = System.currentTimeMillis();

        inicioOrd[2] = System.currentTimeMillis();
        trocasOrdenadas[2] = InsertSort.insertSort(vetorInsert);
        fimOrd[2] = System.currentTimeMillis();

        inicio[3] = System.currentTimeMillis();
        trocasAleatorias[3] = QuickSort.quickSort(vetorQuick);
        fim[3] = System.currentTimeMillis();

        inicioOrd[3] = System.currentTimeMillis();
        trocasOrdenadas[3] = QuickSort.quickSort(vetorQuick);
        fimOrd[3] = System.currentTimeMillis();

        for (int i = 0; i < 4; i++) {
            System.out.println("Tempo decorrido no " + tipoSort[i] + ":\n"
                    + "Aleatoria: \n" + (fim[i] - inicio[i]) + " milissegundos \n"
                    + trocasAleatorias[i] + " trocas  \n"
                    + "Ordenado: " + (fimOrd[i] - inicioOrd[i]) + " milissegundos \n\n"
                    + trocasOrdenadas[i] + " trocas  \n");
        }

    }

}
