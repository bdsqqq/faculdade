package classes;

public class Eleitor {

    private String titulo;
    private String nome;
    private String votou;

    public Eleitor(String titulo, String nome, String votou) {
        this.titulo = titulo;
        this.nome = nome;
        this.votou = votou;
    }

    public Eleitor() {
       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVotou() {
        return votou;
    }

    public void setVotou(String votou) {
        this.votou = votou;
    }

}
