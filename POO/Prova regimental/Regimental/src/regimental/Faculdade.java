package regimental;

public class Faculdade {
    private String nome;
    private String cnpj;
    private AlunoPresencial alunoPresencial;
    private AlunoEad alunoEad;

    public Faculdade() {
        nome = "";
        cnpj = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public static void main(String[] args) {
        // instanciar 2 faculdade e seus alunos
        Faculdade objFaculdade1 = new Faculdade();
        Faculdade objFaculdade2 = new Faculdade();
        AlunoPresencial objAluno1 = new AlunoPresencial(20, "matutino");
        AlunoEad objAluno2 = new AlunoEad(34f);
        AlunoPresencial objAluno3 = new AlunoPresencial(18, "noturno");
        AlunoEad objAluno4 = new AlunoEad(77f);

        // dados faculdade1
        objFaculdade1.setNome("Cruzeiro do sul");
        objFaculdade1.setCnpj("287492847");
        // dados aluno1
        objAluno1.setNome("Caio");
        objAluno1.setRgm("235796375");
        objAluno1.setIdade(24);
        objAluno1.setCpf("8275872523");
        objAluno1.setValorMensalidade(445.2f);
        objAluno1.setValorMensalidade((objAluno1.getValorMensalidade() //calcular desconto mensalidade tá bem aqui não passa por cima sem ver por favor ele tá retornando o valor pra fazer essa continha
                - objAluno1.calcularDescontoMensalidade(objAluno1.getPeriodo(), objAluno1.getValorMensalidade())));
        // dados aluno2
        objAluno2.setNome("Gabriel");
        objAluno2.setRgm("30825235789");
        objAluno2.setIdade(25);
        objAluno2.setCpf("37622376");
        objAluno2.setValorMensalidade(498f);

        // dados faculdade2
        objFaculdade1.setNome("Uninove");
        objFaculdade1.setCnpj("68954578");
        // dados aluno 3
        objAluno3.setNome("Igor");
        objAluno3.setRgm("2317612085");
        objAluno3.setIdade(18);
        objAluno3.setCpf("379417624");
        objAluno3.setValorMensalidade(339.9f);
        objAluno3.setValorMensalidade((objAluno3.getValorMensalidade() //calcular desconto mensalidade tá bem aqui não passa por cima sem ver por favor ele tá retornando o valor pra fazer essa continha
                - objAluno3.calcularDescontoMensalidade(objAluno3.getPeriodo(), objAluno3.getValorMensalidade())));
        // dados aluno4
        objAluno4.setNome("Lucas");
        objAluno4.setRgm("57893125789");
        objAluno4.setIdade(29);
        objAluno4.setCpf("12489120489");
        objAluno4.setValorMensalidade(999f);
    }
}
