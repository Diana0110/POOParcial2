/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

/**
 *
 * @author Diana
 */
public class Agua implements Recurso {

    @Override
    public void incrementan() {
        System.out.println("Ya hay agua");
    }

    @Override
    public Recurso crearRecurso() {
        System.out.println("hay agua");
        return null;
    }
    
}
