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
        }
        return saida;
    }
    
    public static int prio(char op){
        int resp = 0;
        switch(op){
            case'(': resp = 1; break;
            case'+': resp = 2; break;
            case'-': resp = 2; break;
            case'*': resp = 3; break;
            case'/': resp = 3; break;
        }
        return resp;
    }
}
