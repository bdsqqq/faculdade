package estatica.aplicacoes;

import estatica.Pilha;

public class Npr {
    public static String toNPR(String infixa){
        String saida = "";
        Pilha p = new Pilha();
        
        for(int i=0; i < infixa.length(); i++){
            char ch = infixa.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z'){
                saida +=ch;
            }
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                p.push(ch);
            }
            if(ch == ')'){
                saida += p.pop();
            }
        };
        return saida;
    }
}
