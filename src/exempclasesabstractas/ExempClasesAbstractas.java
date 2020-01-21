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
public class ExempClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Poligonos tri = new Triangulo(4f,2f);
        tri.calcularArea();
        
        Poligonos rec = new Rectangulo(4f,2f);
        
        rec.calcularArea();
        
        Circulo cir = new Circulo(4f);
        
        
        
        
        
    }
    
}
