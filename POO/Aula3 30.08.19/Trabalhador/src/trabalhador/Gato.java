/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhador;

/**
 *
 * @author logonpta
 */
public class Gato {
  private String nome;
  private String raca;
  private int idade;
  private float peso;

  public Gato(){
    nome = "khan";
    raca = "desconhecida, mas ele é laranja";
    idade = 8;
    peso = (float) 17.6;
  }

  public Gato(String inputNome, String inputRaca, int inputIdade, float inputPeso){
    nome = inputNome;
    raca = inputRaca;
    idade = inputIdade;
    peso = inputPeso;
  }

  public void mostrar(){
    System.out.println("O nome do gato é: "+nome);
    System.out.println("A raça do bichano é: "+raca);
    System.out.println("O dito cujo tem "+idade+" anos");
    System.out.println("E nunca vi mais gordo, ele pesa: "+peso+"Kg");
  }

  public static void main(String[] args){
    Gato objGato1 = new Gato();
    objGato1.mostrar();

    Gato objGato2 = new Gato("Marcus", "labrador(mas pra gato)", 4, (float) 15.9);
    objGato2.mostrar();
  }

}
