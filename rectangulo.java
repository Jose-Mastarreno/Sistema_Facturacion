/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstpoo;

/**
 *
 * @author SPEEDMIND
 */
public class TRectangulo extends TFigura{

    public TRectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return this.getBase()*this.getAltura(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetro() {
        return 2*getBase()+2*getAltura(); //To change body of generated methods, choose Tools | Templates.
    }

    
    

    

    
}

