package Heranca2;

public class Geral2 {


    public static void main(String[] args) {
     Aluno2 objAluno1 = new Aluno2();
     Aluno2 objAluno2 = new Aluno2();
     Professor2 objProfessor1 = new Professor2();
     AlunoEad2 objAlunoEad2_1 = new AlunoEad2();
     
     //Aluno1
     objAluno1.setNota1(3.0f);
     objAluno1.setNota2(4.2f);
     objAluno1.setNome("Igor");
     objAluno1.setMedia(objAluno1.getNota1(), objAluno1.getNota2());
     System.out.println("O Nome é: "+ objAluno1.getNome());
     System.out.println("A situação é: "+ objAluno1.calcularSituacao(objAluno1.getMedia()));
     
     //Aluno2
     objAluno2.setNota1(3.0f);
     objAluno2.setNota2(2.2f);
     objAluno2.setNome("Gabriel");
     objAluno2.setMedia(objAluno2.getNota1(), objAluno2.getNota2());
     System.out.println("O Nome é: "+ objAluno2.getNome());
     System.out.println("A situação é: "+ objAluno2.calcularSituacao(objAluno2.getMedia()));
     
     //Professor
     objProfessor1.setNome("Goiabinha");
     objProfessor1.setSalario(3000f);
     objProfessor1.setIr(objProfessor1.getSalario());
     System.out.println("O nome do professor é: "+objProfessor1.getNome());
     System.out.println("O IR do professor é: "+objProfessor1.escolherIr(objProfessor1.getSalario())+"%");
     System.out.println("O Salario liquido do professor é: "+objProfessor1.calcularSalario(objProfessor1.getSalario(), objProfessor1.getIr()));
     
     //AlunoEad2_1
     objAlunoEad2_1.setNota1(3.0f);
     objAlunoEad2_1.setNota2(4.2f);
     objAlunoEad2_1.setNome("Caio");
     objAlunoEad2_1.setIdade(22);
     objAlunoEad2_1.setMedia(objAlunoEad2_1.getNota1(), objAlunoEad2_1.getNota2());
     objAlunoEad2_1.setPeso(72.2f);
     objAlunoEad2_1.setRGM("71717282");
     
     System.out.println("A média do aluno é: "+objAlunoEad2_1.getMedia());
     System.out.println("A situação é: "+ objAlunoEad2_1.calcularSituacao(objAlunoEad2_1.getMedia()));
    }
    
}
