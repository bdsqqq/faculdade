/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 *
 * @author logonpta
 */
public class Aluno {
    private int rgm;
    private String nome;
    private String sexo;
    private float notaA;
    private float notaB;
    private float notaC;
    private float notaD;
    private float media;


    public Aluno(){
        nome = "igor";
        rgm = 2222222;
        sexo = "M";
        notaA = 4;
        notaB = 4;
        notaC = 4;
        notaD = 4;
    }

    public Aluno(int rgm, String nome, String sexo, float notaA, float notaB, float notaC, float notaD){

    }

    public float Media(float notaA, float notaB, float notaC, float notaD){
        result = (notaA+notaB+notaC+notaD)/4;

        return result;
    }

    public String Stringador(){
        return rgm + " " + nome + " " + sexo + " " + notaA +" " + notaB +" " + notaC +" " + notaD +" " + media
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
