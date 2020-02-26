package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MinhaJanelaNull extends JFrame implements ActionListener{
    private JLabel texto;
    private JButton salvar;
    private JButton cancelar;

    public MinhaJanelaNull() {
        super("Janela 2.0");
        this.getContentPane().setLayout(null);
    }
    
    public void init(){
        setSize(500, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        texto = new JLabel("Mensagem");
        salvar = new JButton("Enviar");
        cancelar = new JButton("Cancelar");

        texto.setBounds(90, 30, 80, 30);;
        salvar.setBounds(20, 70, 100, 30);
        cancelar.setBounds(130, 70, 100, 30);
        
        salvar.addActionListener(this);
        cancelar.addActionListener(this);
        
        this.add(texto);
        this.add(salvar);
        this.add(cancelar);
    }

    public static void main(String[] args) {
        MinhaJanelaNull Janela = new  MinhaJanelaNull();
        Janela.init();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == salvar){
            JOptionPane.showMessageDialog(null, "Clicou no Salvar");
        }

        if(ae.getSource() == cancelar){
            System.exit(0);
        }
    }
}
