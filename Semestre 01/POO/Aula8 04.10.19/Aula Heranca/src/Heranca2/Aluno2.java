
package Heranca2;

import Heranca.*;

public class Aluno2 extends Pessoa2{
    private float nota1;
    private float nota2;
    private String RGM;
    private float media;

    public Aluno2(float nota1, float nota2, String RGM) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.RGM = RGM;
    }

    public Aluno2() {
        nota1 = 0;
        nota2 = 0;
        RGM = "0";
        media = 0;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public String getRGM() {
        return RGM;
    }

    public void setRGM(String RGM) {
        this.RGM = RGM;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float x, float y) {
        media = calcularMedia(x, y);
    }

   

    @Override
    public String toString() {
        return "Aluno{" + "nota1=" + nota1 + ", nota2=" + nota2 + ", RGM=" + RGM + '}';
    }
    
    private float calcularMedia(float x, float y){
    return x+y;
}
    
    protected String calcularSituacao(float x){
       if(x>=6){
        return "Aprovado";
       } else{
           if(x >=3 && x<=5.99f){
               return "Exame";
           }else{
               return "Reprovado";
           }
       }
                
    }
    public static void main(String[] args) {
     
    }
    
}
