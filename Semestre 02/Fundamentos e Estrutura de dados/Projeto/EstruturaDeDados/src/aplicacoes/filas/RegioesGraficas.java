package aplicacoes.filas;


import estatica.Fila;
import javax.swing.JOptionPane;


public class RegioesGraficas {

    private Ponto matriz[][];

    public RegioesGraficas() {
        matriz = new Ponto[5][5];

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                String cor = JOptionPane.showInputDialog("Cor [" + linha + "][" + coluna + "]");
                matriz[linha][coluna] = new Ponto(linha, coluna, cor);
            }
        }
    }

    public void print() {
        String resp = "";
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                resp += matriz[linha][coluna].getCor() + " ";
            }
            resp += "\n";
        }
        JOptionPane.showMessageDialog(null, resp);
    }

    public void colorir(int x, int y, String c1) {
        Ponto p0 = matriz[x][y];

        String co = p0.getCor();

        Fila fila = new Fila();
        fila.enqueue(p0);

        while (!fila.isEmpty()) {
            Ponto p = (Ponto) fila.dequeue();

            if (p.getY() > 0 && matriz[p.getX()][p.getY() - 1].getCor().equals(co)) {
                fila.enqueue(matriz[p.getX()][p.getY() - 1]);
            }
            if (p.getY() < 4 && matriz[p.getX()][p.getY() + 1].getCor().equals(co)) {
                fila.enqueue(matriz[p.getX()][p.getY() + 1]);
            }
            if (p.getX() > 0 && matriz[p.getX() - 1][p.getY()].getCor().equals(co)) {
                fila.enqueue(matriz[p.getX() - 1][p.getY()]);
            }
            if (p.getX() < 4 && matriz[p.getX() + 1][p.getY()].getCor().equals(co)) {
                fila.enqueue(matriz[p.getX() + 1][p.getY()]);
            }
            p.setCor(c1);
        }
    }
}
