package motorista;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected float peso;
    protected float altura;
    
    
    public Pessoa(){
        nome = "a";
        idade = 0;
        peso = 0f;
        altura = 0f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public static void main(String[] args) {
    
    
    }
    
    
}
