package estatica;

import java.util.Date;

public class TestePilha {
    
    public static void main(String[] args) {
        Pilha p = new Pilha();
        
        p.push("Amilton");
        p.push(22);
        p.push(4500.52);
        p.push('M');
        p.push(true);
        p.push(new Date());
        System.out.println(p.pop());
        
        p.print();
    }
}
