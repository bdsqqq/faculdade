
package Heranca;

import javax.swing.JOptionPane;


public class Professor1 extends Pessoa1{
   private float salario;
   private String numeroRegistro;
   private float ir;

    public Professor1(float salario, String numeroRegistro) {
        this.salario = salario;
        this.numeroRegistro = numeroRegistro;
    }

    public Professor1() {
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
    
    public float getIt(){
        return ir;
    }
    
    protected float escolherIr(float x){
        if(x<=2000.00){
            return 0;
        }else{
            if(x>2000.00 && x<=5000.00){
                return 10;
            }else{
                if(x>5000.00 && x<=10000.00){
                    return 15;
                }else{
                    return 20;
                }
            }
        }
    }
    
    protected float calcularSalario(){
        return salario-salario*(ir/100);
    }

    @Override
    public String toString() {
        return "Professor{" + "salario=" + salario + ", numeroRegistro=" + numeroRegistro + '}';
    }
   
}
