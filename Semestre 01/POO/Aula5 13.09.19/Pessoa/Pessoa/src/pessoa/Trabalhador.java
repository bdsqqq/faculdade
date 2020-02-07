package pessoa;


public class Trabalhador {
    private float salario;
    private String registro;
    
    
    public void Trabalhador(){
        salario = 1200.00f;
        registro = "123-A";
    }
    
    public static void main(String[] args) {
        Pessoa objPessoa1 = new Pessoa();
        System.out.println("O nome é: "+objPessoa1.getNome());
        objPessoa1.setNome("Atom");
        System.out.println("O nome é: "+objPessoa1.getNome());
    }
    
}
