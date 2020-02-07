package regimental;

public class AlunoPresencial extends Aluno{
    private int quantidadeDiasDeAula;
    private String Periodo;

    public AlunoPresencial(int quantidadeDiasDeAula, String Periodo) {
        this.quantidadeDiasDeAula = quantidadeDiasDeAula;
        this.Periodo = Periodo;
    }

    public int getQuantidadeDiasDeAula() {
        return quantidadeDiasDeAula;
    }

    public void setQuantidadeDiasDeAula(int quantidadeDiasDeAula) {
        this.quantidadeDiasDeAula = quantidadeDiasDeAula;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }
    
    public float calcularDescontoMensalidade(String periodo, float mensalidade){
        if("matutino".equals(periodo)){
            return (mensalidade*0.15f);
        }else{
            return 0;
        }
        
    }
}
