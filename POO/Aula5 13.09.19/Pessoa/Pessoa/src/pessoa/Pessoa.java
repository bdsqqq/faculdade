package pessoa;

import static java.time.Clock.system;

public class Pessoa {
    
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    
    public Pessoa(){
        nome = "Athos";
        idade = 13;
        peso = 25.03f;
    }
    
    
    
    public static void main(String[] args) {
        Pessoa objPessoa1 = new Pessoa();
        System.out.println("O nome é: "+objPessoa1.getNome());
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
