package motorista;

public class Motorista extends Pessoa {
    
    private String numCnh;
    private float salario;
    private String categoria;
    private int qtdDeDiasDeFerias;

    public Motorista(String numCnh, float salario, String categoria) {
        this.numCnh = numCnh;
        this.salario = salario;
        this.categoria = categoria;
    }
    
    public Motorista(){
        numCnh = "";
        salario = 0f;
        categoria = "";
        qtdDeDiasDeFerias = 0;
    }
    
    public void calculoFerias(){
        System.out.println("O valor das férias é: "+(salario+salario/3));
    }
    
    public int qtdDeDiasDeFerias(String categoria){
        if(categoria == "A" || categoria == "a"){
            return 28;
        }else{
            if(categoria == "B" || categoria == "b"){
                return 29;
            }else{
                if(categoria == "C" || categoria == "c"){
                    return 30;
                }else{
                    return 31;
                }
            }
        }
    };

    public String getNumCnh() {
        return numCnh;
    }

    public void setNumCnh(String numCnh) {
        this.numCnh = numCnh;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public int getQtdDeDiasDeFerias(){
        return qtdDeDiasDeFerias;
    }
    
    public void setQtdDeDiasDeFerias(String Categoria){
        this.qtdDeDiasDeFerias = qtdDeDiasDeFerias(Categoria);
    }
    
    @Override
    public String toString() {
        return "nome: " + nome + ", idade: " + idade + ", peso: " + peso + ", altura: " + altura + ", numero do CNH: "+numCnh+", Salario: "+salario+", Categoria: "+categoria+", Dias de férias: "+qtdDeDiasDeFerias;
    }
    
    
    public static void main(String[] args) {
        Motorista objMotorista1 = new Motorista();
        
        
        objMotorista1.setNumCnh("2224");
        objMotorista1.setSalario(2001.00f);
        objMotorista1.setCategoria("C");
        objMotorista1.setQtdDeDiasDeFerias(objMotorista1.getCategoria());
     
        System.out.println(objMotorista1.toString());
    
    }
    
}
