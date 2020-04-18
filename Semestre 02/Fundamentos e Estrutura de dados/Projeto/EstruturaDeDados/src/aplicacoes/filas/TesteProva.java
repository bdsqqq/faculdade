/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacoes.filas;

import estatica.Fila;
import estatica.Pilha;

/**
 *
 * @author igor
 */
public class TesteProva {

    public static void main(String[] args) {
        Pilha p = new Pilha();
        Fila f = new Fila();
        for (int i = 5; i < 13; i += 3) {
            f.enqueue(i - 1);
            p.push(i);
        };

        while (!f.isEmpty()) {
            p.push(f.dequeue());
        }

        while (!p.isEmpty()) {
            System.out.print(p.pop() + ",");
        };
    }

}
