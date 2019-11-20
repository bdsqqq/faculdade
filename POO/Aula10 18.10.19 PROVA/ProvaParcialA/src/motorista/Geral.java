package motorista;

public class Geral {

    public static void main(String[] args) {
        //inciar objetos
        Motorista objMotorista1 = new Motorista();
        Motorista objMotorista2 = new Motorista();
        Motorista objMotorista3 = new Motorista();
        
        //Atribui valores ao Obj1
        objMotorista1.setNome("Jorge");
        objMotorista1.setIdade(42);
        objMotorista1.setPeso(98.2f);
        objMotorista1.setAltura(1.87f);
        objMotorista1.setNumCnh("123424");
        objMotorista1.setSalario(7000.00f);
        objMotorista1.setCategoria("E");
        objMotorista1.setQtdDeDiasDeFerias(objMotorista1.getCategoria());
        
        //Printa o Obj1
        System.out.println(objMotorista1.toString());
        objMotorista1.calculoFerias();
        
        
        //Atribui valores ao Obj2
        objMotorista2.setNome("vitor");
        objMotorista2.setIdade(33);
        objMotorista2.setPeso(64.2f);
        objMotorista2.setAltura(1.70f);
        objMotorista2.setNumCnh("232323");
        objMotorista2.setSalario(3800.00f);
        objMotorista2.setCategoria("B");
        objMotorista2.setQtdDeDiasDeFerias(objMotorista2.getCategoria());
        
        //Printa o Obj2
        System.out.println(objMotorista2.toString());
        objMotorista2.calculoFerias();
        
        
        //Atribui valores ao Obj3
        objMotorista3.setNome("marcus");
        objMotorista3.setIdade(27);
        objMotorista3.setPeso(74.8f);
        objMotorista3.setAltura(1.79f);
        objMotorista3.setNumCnh("414141");
        objMotorista3.setSalario(5000.00f);
        objMotorista3.setCategoria("C");
        objMotorista3.setQtdDeDiasDeFerias(objMotorista3.getCategoria());
        
        //Printa o Obj3
        System.out.println(objMotorista3.toString());
        objMotorista3.calculoFerias();
        
        
    }
    
}
