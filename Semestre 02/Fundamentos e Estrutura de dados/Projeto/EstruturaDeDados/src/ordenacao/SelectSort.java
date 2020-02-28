package ordenacao;

public class SelectSort extends Sort {

    public void selectSort(int array[]) {
        int aux;
        int tam = array.length;

        for (int i = 0; i < tam - 1; i++) {

            for (int j = i + 1; j < tam; j++) {

                if (array[j] < array[i]) {
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
    }

    public void selectSort(String array[]) {
        String aux;
        int tam = array.length;

        for (int i = 0; i < tam - 1; i++) {

            for (int j = i + 1; j < tam; j++) {

                if (array[j].compareToIgnoreCase(array[i]) < 0) {
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
    }
}
