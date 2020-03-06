package ordenacao;

public class QuickSort extends Sort {

    public static long quickSort(int vetor[]) {
        long cont = 0;
        cont = quickSort(vetor, 0, vetor.length - 1, cont);
        return cont;
    }

    public static long quickSort(int vetor[], int i, int s, long cont) {
        int e = i, d = s;
        int item = vetor[((e + d) / 2)];

        while (e <= d) {
            while (vetor[e] < item) {
                e++;
            }
            while (vetor[d] > item) {
                d--;
            }
            if (e <= d) {
                int aux;
                aux = vetor[e];
                vetor[e] = vetor[d];
                vetor[d] = aux;
                if (vetor[e] != vetor[d]) {
                    cont++;
                }
                d--;
                e++;
            }

        }
        if (d - i > 0) {
            cont = quickSort(vetor, i, d, cont);
        }
        if (s - e > 0) {
            cont = quickSort(vetor, e, s, cont);
        }
        return cont;
    }
}
