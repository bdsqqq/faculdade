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
public class Pessoa {
  private String nome;
  private String rg;
  private String cpf;
  private String cor;
  private String cordosolhos;
  private int idade;
  private int auxIdade;
  private int idadeEmDias;

  public Pessoa(String inputNome, String inputRg, String inputCpf, String inputCor, String inputCordosolhos, int inputIdade){
    nome = inputNome;
    rg = inputRg;
    cpf = inputCpf;
    cor = inputCor;
    cordosolhos = inputCordosolhos;
    idade = inputIdade;
    idadeEmDias = calcularEmDias(idade);
  }

  public int calcularEmDias(int inputIdade){
      /*auxIdade = (inputIdade*365);
      
       System.out.println("Em dias isso fica: "+idadeEmDias+" dias");*/
      return inputIdade * 365;
  }

  public void mostrar(){
    System.out.println("O nome do miliante é: "+nome);
    System.out.println("Cor do individuo é: "+cor);
    System.out.println("O RG do dito cujo é: "+rg);
    System.out.println("O RG do dito cujo é: "+cpf);
    System.out.println("O fulano tem os olhos: "+cordosolhos);
    System.out.println("E nunca vi mais velho, ele tem: "+idade+" anos");
    System.out.println("Em dias isso fica: "+idadeEmDias+" dias");
  }

  public static void main(String[] args){
    Pessoa objPessoa1 = new Pessoa("Marcus","Verde","82776","8738937","verde também",18);
    objPessoa1.mostrar();
  }
}
