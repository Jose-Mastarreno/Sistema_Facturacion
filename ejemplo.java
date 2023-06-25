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
public class TFigura {
    private final int base;
    private final int altura;

    public TFigura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    public double area(){
    return 0;
    }
    public double perimetro(){
    return 0;
    }

    @Override
    public String toString() {
        return "TFigura{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
