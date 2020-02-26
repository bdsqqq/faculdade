package exercicio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

    public class Gui extends JFrame implements ActionListener {
    private JPanel panelSituacao, panelMedia;
    private JButton btnCalcular;
    private JTextField pp, pr, pj, tr;
    private JLabel txtSituacao, txtMedia;
    private float media;
    private boolean situacao;
    
    public Gui(){
        super("Calculador de Médias louco");
        this.getContentPane().setLayout(new GridLayout(2, 2));
    }
    
    public float calcularMedia(float pp, float pr, float pj, float tr){
        return (float) (0.3*pp + 0.5*pr + 0.1*pj + 0.1*tr);
    }
    
    public void init(){
        setSize(360, 360);
        setLocation(500, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(this);
        panelSituacao = new JPanel(new FlowLayout());
        panelMedia = new JPanel(new FlowLayout());
        txtSituacao = new JLabel(" - ");
        txtMedia = new JLabel(" - ");
        pp = new JTextField(4);
        pr = new JTextField(4);
        pj = new JTextField(4);
        tr = new JTextField(4);
        
        JPanel inputPanelWrapper = new JPanel(new BorderLayout());
        
        JPanel nomePanel = new JPanel(new FlowLayout());
        JPanel ppPanel = new JPanel(new FlowLayout());
        JPanel prPanel = new JPanel(new FlowLayout());
        JPanel pjPanel = new JPanel(new FlowLayout());
        JPanel trPanel = new JPanel(new FlowLayout());
        
        JPanel auxPanel = new JPanel(new BorderLayout());

        nomePanel.add(new JLabel("Nome"));
        nomePanel.add(new JTextField(4));
        ppPanel.add(new JLabel("Prova Parcial"));
        ppPanel.add(pp);
        prPanel.add(new JLabel("Prova Regimental"));
        prPanel.add(pr);
        pjPanel.add(new JLabel("Projeto"));
        pjPanel.add(pj);
        trPanel.add(new JLabel("Trabalhos"));
        trPanel.add(tr);
        
        auxPanel.add(prPanel, BorderLayout.NORTH);
        auxPanel.add(pjPanel, BorderLayout.CENTER);
        auxPanel.add(trPanel, BorderLayout.SOUTH);
        
        inputPanelWrapper.add(nomePanel, BorderLayout.NORTH);
        inputPanelWrapper.add(ppPanel, BorderLayout.CENTER);
        inputPanelWrapper.add(auxPanel, BorderLayout.SOUTH);
        
        panelMedia.add(new JLabel("Media: "));
        panelMedia.add(txtMedia);
        
        panelSituacao.add(new JLabel("Situação: "));
        panelSituacao.add(txtSituacao);
        
        this.add(inputPanelWrapper);
        this.add(panelMedia);
        this.add(btnCalcular);
        this.add(panelSituacao);
    }
    
    public static void main(String[] args) {
        Gui Janela = new  Gui();
        Janela.init();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == btnCalcular){
           media = calcularMedia(
                        Float.parseFloat(pp.getText()), 
                        Float.parseFloat(pr.getText()), 
                        Float.parseFloat(pj.getText()), 
                        Float.parseFloat(tr.getText())
                    );
           
           txtMedia.setText(String.valueOf(media));
           
           if (media >= 6){
               txtSituacao.setText("Aprovado");
           }else{
               if (media >= 3){
                   txtSituacao.setText("Exame");
               }else{
                   txtSituacao.setText("DP");
               }
           }
       }
    }
}


