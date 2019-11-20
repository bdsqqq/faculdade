
package Heranca2;

import Heranca.*;
import javax.swing.JOptionPane;

public abstract class Pessoa2 {
  
    private String nome;
    private int idade;
    private float peso;

    public Pessoa2(String nome, int idade, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    
    public Pessoa2() {
        nome = "";
        idade =  0; 
        peso = 0f;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso + '}';
    }
    
    public void comer(){
        System.out.println("comendo... /n");
    }
    
    public abstract void andar();
   
}
