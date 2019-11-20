/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author logonpta
 */
public class Carro {
    private String modelo;
    private int ano;
    private float valor;
    private String cor;
    private String nome;


    //Metodo construtor da classe carro
    public Carro(String inputModelo, int inputAno, float inputValor, String inputCor, String inputNome){
        modelo = inputModelo;
        ano = inputAno;
        valor = inputValor;
        cor = inputCor;
        nome = inputNome;
    }

    //Metodo que mostra
    public void mostrar(){
        System.out.println("O modelo é: "+modelo);
        System.out.println("O ano é: "+ano);
        System.out.println("O valor é: "+valor);
        System.out.println("A cor é: "+cor);
        System.out.println("O nome é: "+nome);
    }
    
    public static void main(String[] args) {
    Carro objCarro1 = new Carro("Emperor",121,399.99f,"marmore","Marcus Antonius Aurelius");
    objCarro1.mostrar();
    }
}
