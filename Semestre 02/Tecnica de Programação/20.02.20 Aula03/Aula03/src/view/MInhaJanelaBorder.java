package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MInhaJanelaBorder extends JFrame {
    private JLabel texto;
    private JButton salvar;
    private JButton cancelar;

    public MInhaJanelaBorder() {
        super("Janela 2.0");
        this.getContentPane().setLayout(new BorderLayout());
    }
    
    public void init(){
        setSize(500, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        texto = new JLabel("Mensagem");
        salvar = new JButton("Enviar");
        cancelar = new JButton("Cancelar");

        this.add(texto, BorderLayout.CENTER);
        this.add(salvar, BorderLayout.WEST);
        this.add(cancelar, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        MInhaJanelaBorder Janela = new  MInhaJanelaBorder();
        Janela.init();
    }

}
