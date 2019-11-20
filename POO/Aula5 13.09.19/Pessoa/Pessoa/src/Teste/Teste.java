package Teste;

import pessoa.*;

public class Teste {
    public static void main(String[] args) {
        Pessoa objPessoa1 = new Pessoa();
        System.out.println("O nome é: "+objPessoa1.getNome());
        objPessoa1.setNome("Atom");
        System.out.println("O nome é: "+objPessoa1.getNome());
    }
}
