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
import java.util.Scanner;
public class MyFirstPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int _base, _altura;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la base del Figura");
        _base=sc.nextInt();
        System.out.println("Ingrese la altura del Figura");
        _altura=sc.nextInt();
        TFigura rec=new TRectangulo(_base, _altura);
        System.out.println("el area del rectangulo es: "+rec.area());
        System.out.println("el perimetro del rectangulo es: "+rec.perimetro());
        TFigura tri=new Ttriangulo(_base, _altura);
        System.out.println("el area del tgriangulo es: "+tri.area());
        System.out.println("el perimetro del triangulo es: "+tri.perimetro());
        System.out.println(tri.toString());
    }
    
}
