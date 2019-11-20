package teste;


public class Carro {
    private float valor;
    private String nome;
    private Motor motor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.setNome("Sandero");
        carro.setValor(2.0f);        
        
        carro.setMotor(new Motor());
        carro.getMotor().setPotencia(1.2f);
    }
}
