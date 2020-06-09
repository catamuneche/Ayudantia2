/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

/**
 *
 * @author Cata
 */
public abstract class FiguraGeometrica {
    String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void area();
    public abstract void perimetro();
    
}
