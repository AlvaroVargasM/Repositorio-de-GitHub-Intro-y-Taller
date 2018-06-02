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
public class Figura {
    int x;
    int y;
/* Metodo constructor, son los datos que inicializan el objeto
    */
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
        if (x<1024 && x>0){
            this.x = 500;
        if (y<756 && x>0){
            this.y = 250;
        }
        
    }
                  
    }
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
