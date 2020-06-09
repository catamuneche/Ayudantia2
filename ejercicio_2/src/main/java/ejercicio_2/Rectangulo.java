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
public class Rectangulo extends FiguraGeometrica { 
    //Atributos
    int alto;
    int ancho;
    
    //Constructor
    public Rectangulo(int alto, int ancho, String nombre) {
        super(nombre);
        this.alto = alto;
        this.ancho = ancho;
    }
    
    //Métodos
    @Override
    public void area(){
        int area = alto * ancho;
        System.out.println("el area del rectangulo es: " + area);
    }
    
    @Override
    public void perimetro(){
        int perimetro = alto + alto + ancho + ancho;
        System.out.println("el perimetro del rectangulo es: " + perimetro);
    }
    
    //Getters y setters
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    
}

