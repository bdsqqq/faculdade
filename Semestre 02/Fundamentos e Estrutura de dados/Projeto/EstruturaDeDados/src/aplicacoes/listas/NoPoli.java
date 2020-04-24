package aplicacoes.listas;

public class NoPoli {

    private float coef;
    private int expo;
    private NoPoli prox;

    public float getCoef() {
        return coef;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }

    public int getExpo() {
        return expo;
    }

    public void setExpo(int expo) {
        this.expo = expo;
    }

    public NoPoli getProx() {
        return prox;
    }

    public void setProx(NoPoli prox) {
        this.prox = prox;
    }
}
