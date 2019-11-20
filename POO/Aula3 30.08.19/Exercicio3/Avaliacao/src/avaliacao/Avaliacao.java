package avaliacao;

import javax.swing.JOptionPane;

public class Avaliacao {

    private String nome;
    private String tipoAvaliacao;
    private float notaMaxima;
    private float percentual;

    public Avaliacao(String nome, String tipoAvaliacao, float notamaxima, float percentual) {
        this.nome = nome;
        this.tipoAvaliacao = tipoAvaliacao;
        this.notaMaxima = notaMaxima;
        this.percentual = percentual;
    }
    
    public float calcularPer(){
        percentual = ((notaMaxima / 10.0f)*100.0f);
        return percentual;
    }

@Override
    public String toString() {
        return "Avaliacao{" + "nome=" + nome + ", tipoAvaliacao=" + tipoAvaliacao + ", notaMaxima=" + notaMaxima + ", percentual=" + percentual + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAvaliacao() {
        return tipoAvaliacao;
    }

    public void setTipoAvaliacao(String tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }

    public float getNotaMaxima() {
        return notaMaxima;
    }

    public void setNotaMaxima(float notaMaxima) {
        this.notaMaxima = notaMaxima;
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }
    
    
    public static void main(String[] args) {
        Avaliacao objAvaliacao1 = new Avaliacao();
        String nome = JOptionPane.showInputDialog(null, "Digite o seu Nome", "Nome", JOptionPane.INFORMATION_MESSAGE);
        objAvaliacao.toString();
    }
    
}
