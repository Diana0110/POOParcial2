/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

/**
 *
 * @author Diana
 * ABSTRACT BUILDER
 */
public interface Recurso {
    public int crearRecurso(int recurso, int recurso2);
    public void comprarRecurso(Recurso recurso1, Recurso recurso2);
}
