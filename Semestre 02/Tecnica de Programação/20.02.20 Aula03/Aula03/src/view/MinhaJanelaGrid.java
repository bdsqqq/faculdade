package view;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MinhaJanelaGrid extends JFrame {
    private JLabel texto;
    private JButton salvar;
    private JButton cancelar;

    public MinhaJanelaGrid() {
        super("Janela 2.0");
        this.getContentPane().setLayout(new GridLayout(2, 2));
    }
    
    public void init(){
        setSize(500, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        texto = new JLabel("Mensagem");
        salvar = new JButton("Enviar");
        cancelar = new JButton("Cancelar");

        this.add(texto);
        this.add(salvar);
        this.add(cancelar);
    }

    public static void main(String[] args) {
        MinhaJanelaGrid Janela = new  MinhaJanelaGrid();
        Janela.init();
    }
}
