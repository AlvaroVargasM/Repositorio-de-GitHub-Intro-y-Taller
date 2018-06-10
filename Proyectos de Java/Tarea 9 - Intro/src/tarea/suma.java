package tarea;
import java.util.Scanner;
public class suma{ 
    public suma(){}
    public int numeroASumar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero a sumar: ");
        int Numero = entrada.nextInt();
        return Numero;
        }  
   public void sumatoria(){
       int suma = 0;
       int Numero = numeroASumar();
       while (Numero != 0){
            suma += Numero;
            Numero = numeroASumar();
       }
       System.out.println("Resultado de la suma: " + suma);
   }       
}
    
    

