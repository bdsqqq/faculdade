package matematica;

public class Baskara {
    private float a;
    private float b;
    private float c;
    
    public Baskara(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private float calcularDelta(){
        return b*b - 4*a*c;
    }
    
    public void imprimirRaizes(){
        float delta;
        delta = calcularDelta();
        
        if(delta<0){
            System.out.println("N tem a famosa raiz");
        }else{
            float x1, x2;
            x1 = (-b + (float)Math.sqrt(delta))/ (2*a);
            x2 = (-b - (float)Math.sqrt(delta))/ (2*a);
            
            System.out.println("As Raizes são: "+x1+ " e " +x2);
        }
    }
    
    
}
