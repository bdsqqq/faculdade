package recursividade;

public class Math {
    
    public static double fat(int n){
        if(n == 0){
            return 1;
        }else{
            return n * fat(n-1);
        }
    }
    
    public static int fibbonnacci(int ordem){
        if(ordem <= 2){
            return 1;
        }else {
            return fibbonnacci(ordem-1) + fibbonnacci(ordem-2);
        }
    }
    
    public static void hanoi(int n, int a, int b, int c) {
        if (n == 1) {
            System.out.println("Mova disco 1 da torre " + a + " para a torre " + c);
        } else {
            hanoi(n - 1, a, c, b);
            System.out.println("Move disco " + n + " da torre " + a + "para a torre " + c);
            hanoi(n - 1, b, a, c);
        }
    }
    
    public static void main(String[] args) {
        Math.hanoi(45, 1, 2, 3);
    }
}
