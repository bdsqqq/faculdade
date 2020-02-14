package exemplos;

import java.awt.Color;
import javax.swing.JFrame;
        
/*@author Igor Bedesqui*/

public class MinhaJanela extends JFrame {
    
    public MinhaJanela() {
        setTitle("Minha Primeira Janela Dahora");
        setSize(300, 200);
        setLocation(300, 200); //Left:300 Top: 200
        setVisible(true); //true: visivel. false:invisivel
        getContentPane().setBackground(Color.red);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        MinhaJanela teste = new MinhaJanela();
    }
}
