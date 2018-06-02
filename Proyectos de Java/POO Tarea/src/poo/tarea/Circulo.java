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
public class  Circulo extends Figura{
    int radio;
    
    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio=radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public double Area(){
        return radio *  Math.PI;
    }
}
