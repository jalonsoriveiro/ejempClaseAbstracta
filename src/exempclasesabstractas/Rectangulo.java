/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempclasesabstractas;

/**
 *
 * @author jalonsoriveiro
 */
public class Rectangulo extends Cuadrilatero {

    @Override
    public void calcularArea() {
        //Cuadrilatero rec = new Cuadrilatero(); Non podemos instanciar por ser Abstract
        Cuadrilatero rec = new Rectangulo();
        
                                                //con obj       //static       //super 
        System.out.println("Area Rectangulo= "+(rec.getAltura()*getBase()*super.getAltura()));
    }
    
}
