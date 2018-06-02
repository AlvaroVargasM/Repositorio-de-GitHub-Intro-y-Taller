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
public class Rectangulo extends Figura {
    int Ancho;
    int Largo;

    public Rectangulo(int Ancho, int Largo, int x, int y) {
        super(x, y);
        this.Ancho = Ancho;
        this.Largo = Largo;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }

    public int getLargo() {
        return Largo;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }
public int Area(){
    return Largo * Ancho;
    }
    
    
}
