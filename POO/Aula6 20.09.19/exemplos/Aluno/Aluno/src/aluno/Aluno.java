package aluno;


public class Aluno {
    private String nome;
    private String rgm;
    private float a1;
    private float a2;
    private float media;

    public Aluno(String nome, String rgm, float a1, float a2, float media) {
        this.nome = nome;
        this.rgm = rgm;
        this.a1 = a1;
        this.a2 = a2;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public float getA1() {
        return a1;
    }

    public void setA1(float a1) {
        this.a1 = a1;
    }

    public float getA2() {
        return a2;
    }

    public void setA2(float a2) {
        this.a2 = a2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", rgm=" + rgm + ", a1=" + a1 + ", a2=" + a2 + ", media=" + media + '}';
    }
    
    
    public void calcularMedia(){
        media = a1 + a2;
        
        if (media >= 3 && media <=10){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
    
     public static void main(String[] args) {
        
        Aluno objAluno1 = new Aluno("athos", "212882829", 1.75f, 1.5f, 0f);
        objAluno1.calcularMedia();
        System.out.println(objAluno1.toString() + "Os Dados são:");
        
    }
}
