package ordenacao;

public class InsertSort extends Sort {

    public void insertSort(int array[]) {
        int aux;
        int tam = array.length;
        int j;

        for (int i = 1; i < tam; i++) {
            aux = array[i];
            j = i - 1;
            while (j >= 0 && aux < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }

    public void insertSort(String array[]) {
        String aux;
        int tam = array.length;
        int j;

        for (int i = 1; i < tam; i++) {
            aux = array[i];
            j = i - 1;
            while (j >= 0 && aux.compareToIgnoreCase(array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }
}
