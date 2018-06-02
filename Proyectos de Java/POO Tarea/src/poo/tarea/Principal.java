/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tarea;

/**
 *
 * @author valva
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo miCirculo = new Circulo (100,100,20);
        System.out.println(miCirculo.Area());
        
        Rectangulo miRectangulo = new Rectangulo ( 20, 20, 100, 100);
        System.out.println(miRectangulo.Area());
    }
    
}
