package teste;

import javax.swing.JOptionPane;
import java.util.*;

public class Teste {

    public static void main(String[] args) {
        
        int idade[] = new int[3];
        
        /*idade[0] = Integer.parseInt( JOptionPane.showInputDialog(null, "insira a idade", JOptionPane.INFORMATION_MESSAGE));
        idade[1] = Integer.parseInt( JOptionPane.showInputDialog(null, "insira a idade", JOptionPane.INFORMATION_MESSAGE));
        idade[2] = Integer.parseInt( JOptionPane.showInputDialog(null, "insira a idade", JOptionPane.INFORMATION_MESSAGE));*/
        
        /*for(int i = 0; i < idade.length; i++){
            idade[i] = Integer.parseInt( JOptionPane.showInputDialog(null, "insira a idade", JOptionPane.INFORMATION_MESSAGE));
        }
        
        int busca = Integer.parseInt( JOptionPane.showInputDialog(null, "insira o item buscado", JOptionPane.INFORMATION_MESSAGE));
        
        System.out.println("A idade é: "+idade[(busca-1)]);*/
        
        /*Pessoa pessoa = new Pessoa();
    
        Pessoa vetPessoas[] = new Pessoa[5];

        for(int i = 0; i < vetPessoas.length; i++){
                vetPessoas[i] = new Pessoa();
                
                vetPessoas[i].setNome(JOptionPane.showInputDialog(null, "insira o nome da pessoa "+(i+1), JOptionPane.INFORMATION_MESSAGE));
                vetPessoas[i].setIdade(Integer.parseInt( JOptionPane.showInputDialog(null, "insira a idade de "+vetPessoas[i].getNome(), JOptionPane.INFORMATION_MESSAGE)));
        }*/
        
        
        ArrayList<Pessoa> listPessoas = new ArrayList();
        listPessoas.add(new Pessoa());
        listPessoas.add(new Pessoa());
        listPessoas.add(new Pessoa());
        
        listPessoas.get(0).setIdade(32);
        
        System.out.println("A idade do primeiro elemento é: "+listPessoas.get(0).getIdade());
        
    }

}
