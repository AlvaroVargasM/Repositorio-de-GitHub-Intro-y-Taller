package suma.de.array;
import java.util.Scanner;
public class Vectores {
    public Vectores(){}
    public int[] llenarArray(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la longitud del vector: ");
        int longitud = entrada.nextInt();
        int[] vector = new int[longitud];
        for(int contador = 0; contador < vector.length; contador++){
            System.out.println("Ingrese el valor del array para la posicion " + contador);
            vector [contador] = entrada.nextInt();                           
        }
        return vector;
    }
    public int sumarElementos(int[] vector1){
        int suma = 0;
        for (int valor : vector1){
            suma += valor;
        }
        return suma;
    }
    public static void main(String[] args){
        Vectores vect = new Vectores();
        System.out.println("Llenar valores del array 1");
        int[] vector1 = vect.llenarArray();
        int resultado = vect.sumarElementos(vector1);
        System.out.println("La suma es: " + resultado);
    }
}
