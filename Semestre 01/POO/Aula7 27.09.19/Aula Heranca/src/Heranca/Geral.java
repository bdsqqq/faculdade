
package Heranca;


public class Geral {


    public static void main(String[] args) {
     Aluno objAluno1 = new Aluno();
     Aluno objAluno2 = new Aluno();
     Professor objProfessor1 = new Professor();
     
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
     System.out.println("O Salario liquido do professor é: "+objProfessor1.calcularSalario());
    }
    
}
