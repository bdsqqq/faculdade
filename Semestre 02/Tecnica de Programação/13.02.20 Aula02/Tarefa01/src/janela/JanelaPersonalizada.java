package janela;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
        
/*@author Igor Bedesqui*/

public class JanelaPersonalizada extends JFrame {
    
    private final JTextArea objTexto;
    
    public JanelaPersonalizada(String nome, int x, int y, String texto) {
        objTexto = new JTextArea(texto);
        setTitle(nome);
        setSize(x, y);
        setLocation(400, 300); //Left:300 Top: 200
        setVisible(true); //true: visivel. false:invisivel
        getContentPane().setBackground(Color.yellow);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(objTexto);
    }
    
    public static void main(String[] args) {
        JanelaPersonalizada teste = new JanelaPersonalizada(
                JOptionPane.showInputDialog(null, "Digite o nome"),
                Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o x")),
                Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o y")),
                JOptionPane.showInputDialog(null, "Digite o texto")
        );
    }
}
