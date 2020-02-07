package regimental;

public class AlunoEad extends Aluno{
    private float descontoMensalidade;

    public float getDescontoMensalidade() {
        return descontoMensalidade;
    }

    public void setDescontoMensalidade(float descontoMensalidade) {
        this.descontoMensalidade = descontoMensalidade;
    }

    public AlunoEad(float descontoMensalidade) {
        this.descontoMensalidade = descontoMensalidade;
    }
}
