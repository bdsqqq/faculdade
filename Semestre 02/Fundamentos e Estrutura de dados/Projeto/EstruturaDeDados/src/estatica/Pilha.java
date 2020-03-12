package estatica;

public class Pilha {
    
    private Object memo[];
    private int MAX;
    private int posicaoTopo;
    
    public Pilha(){
        MAX = 30;
        memo = new Object[MAX];
        posicaoTopo = -1;
    }
    
    public boolean isEmpty(){
        return (posicaoTopo == -1);
    }
    
    public boolean isFull(){
        return (posicaoTopo+1 == MAX);
    }
    
    public void push(Object x){
        if(!isFull()){
            posicaoTopo++;
            memo[posicaoTopo] = x;
        }else{
            System.out.println("Stack Overflow");
        }
    }
    
    public Object pop(){
        if(!isEmpty()){
            return memo[posicaoTopo--];
            //primeiro ele usa o valor depois decrementa, se fosse --posicaoTopo ia decrementar antes de usar
        }else{
            return null;
        }
    }
    
    public Object top(){
        if(!isEmpty()){
            return memo[posicaoTopo];
        }else{
            return null;
        }
    }
    
    public void print(){
        if(!isEmpty()){
            String temp = "";
            for(int i = 0; i <=posicaoTopo; i++){
                if(i < posicaoTopo){
                    temp += memo[i]+", ";
                }else{
                    temp += memo[i];
                }
            }
            System.out.println("Pilha = [ "+temp+" ]");
        } else{
            System.out.println("Stack Empty");
        }
    }
    
    public String returnPilha(){
        if(!isEmpty()){
            String temp = "";
            for(int i = 0; i <=posicaoTopo; i++){
                if(i < posicaoTopo){
                    temp += memo[i]+", ";
                }else{
                    temp += memo[i];
                }
            }
            return ("Pilha = [ "+temp+" ]");
        } else{
            return "Stack Empty" ;
        }
    };
}
