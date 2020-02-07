package Heranca2;


public class AlunoPresencial2 extends Aluno2{
    private String diasDeAula;
    private String horariosDeAula;
    
    public String getDiasDeAula(){
        return diasDeAula;
    }
    
    public String getHorariosDeAula(){
        return horariosDeAula;
    }
    
    public void setDiasDeAula(String diasDeAula){
        this.diasDeAula = diasDeAula;
    }
    
    public void setHorariosDeAula(String horariosDeAula){
        this.horariosDeAula = horariosDeAula;
    }
    
    public static void main(String [] args){
        AlunoPresencial2 objAlunoPresencial2_1 = new AlunoPresencial2();
        
        
    }
}