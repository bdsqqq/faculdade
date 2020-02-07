/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.o.o;

/**
 *
 * @author logonpta
 */
public class Trabalhador {
    //Atributos são boa pratica manter em private
    private String nome; //String é a unica forma de variavel que tem maiuscula no começo
    private float salario; //Variaveis são atributos, dados.

    //Metodos são boa pratica manter em public
    public Trabalhador(){ //Metodo construtor, é responsavel por definir o objeto
        nome ="Igor"; // Literals gostam de aspas duplas
        salario = 999.80f; //Float é chato, só funciona com f no final
    }

    public Trabalhador(String inputNome, float inputSalario){ //Metodo construtor, é responsavel por definir o objeto
        nome =inputNome;
        salario = inputSalario;
    }
    
    public void mostrar(){
      System.out.println("nome é: "+ nome);
      System.out.println("E recebe: "+ salario);
    }

    public static void main(String[] args) {
          Trabalhador objTrabalhador1 = new Trabalhador("Igor", 800.57f);
      objTrabalhador1.mostrar();
        
    }
}
