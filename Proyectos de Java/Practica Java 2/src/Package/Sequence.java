package Package;
import java.util.Scanner;
public class Sequence {
    Sequence(){}
    public void serie(){
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int numero1 = entrada1.nextInt();
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int numero2 = entrada2.nextInt();
        int suma = 0;
        int aux = numero1;
        while (aux < numero2 - 1){
            ++aux;
            suma += aux;
        }
        System.out.println(suma);
    } 
}
