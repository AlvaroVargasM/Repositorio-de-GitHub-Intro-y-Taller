import java.util.Scanner;
public class Figure {
    public Figure(){}
    private int pedirAltura(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el altura del triangulo: ");
        int altura = entrada.nextInt();
        return altura;
    }
    public void dibujar(){
        int altura = pedirAltura();
        String ast = "*";
        for (int i = 0; i < altura; i++){
            System.out.println(ast);
            ast += "*";    
        }
            
    }
    
}
