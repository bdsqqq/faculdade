
package Heranca2;

import Heranca.*;
import javax.swing.JOptionPane;


public class Professor2 extends Pessoa2{
   private float salario;
   private String numeroRegistro;
   private float ir;

    public Professor2(float salario, String numeroRegistro) {
        this.salario = salario;
        this.numeroRegistro = numeroRegistro;
    }

    public Professor2() {
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    public void setIr(float x){
        ir = escolherIr(x);
    }
    
    public float getIr(){
        return ir;
    }
    
    protected float escolherIr(float x){
        if(x<=2000.00){
            return 0f;
        }else{
            if(x>2000.00 && x<=5000.00){
                return 10f;
            }else{
                if(x>5000.00 && x<=10000.00){
                    return 15f;
                }else{
                    return 20f;
                }
            }
        }
    }
    
    protected float calcularSalario(float salario, float ir){
        return this.salario-this.salario*(this.ir/100);
    }

    @Override
    public String toString() {
        return "Professor{" + "salario=" + salario + ", numeroRegistro=" + numeroRegistro + '}';
    }
   
}
