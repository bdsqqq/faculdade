package exemplos;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
        
/*@author Igor Bedesqui*/

public class MinhaJanela2 extends JFrame {
    
    private JTextArea texto;
    private JButton botao;
    
    
    public MinhaJanela2() {
        texto = new JTextArea("digite aqui...");
        botao = new JButton("Clique aqui.");
        
        setTitle("Minha Primeira Janela Dahora");
        setSize(300, 200);
        setLocation(300, 200); //Left:300 Top: 200
        setVisible(true); //true: visivel. false:invisivel
        getContentPane().setBackground(Color.yellow);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(texto);
        texto.setForeground(Color.yellow);

        this.add(botao);
    }
    
    public static void main(String[] args) {
        MinhaJanela2 teste = new MinhaJanela2();
    }
}
