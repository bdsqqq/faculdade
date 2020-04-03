package aplicacoes.filas;

import javax.swing.JOptionPane;

public class TesteRegioesGraficas {

    public static void main(String[] args) {
        RegioesGraficas reg = new RegioesGraficas();
        reg.print();
        do {
            int x = Integer.parseInt(JOptionPane.showInputDialog("X:"));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Y:"));
            String cor = JOptionPane.showInputDialog("Cor");
            reg.colorir(x, y, cor);
            reg.print();
        } while (true);
    }

}
