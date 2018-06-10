package Package;
import java.util.Scanner;
public class Multiples {
    Multiples(){}
    private int n_usuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escoja un numero: ");
        int numero = entrada.nextInt();
        return numero;
    }
    public void table(){
        int cont = 1;
        int n = n_usuario();
        while (cont < 11){
            int mult = n*cont;
            System.out.println(n + " * " +cont+ " = " + mult);
            cont++;
        }        
    }
}
