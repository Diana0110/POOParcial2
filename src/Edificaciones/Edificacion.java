/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

import Recursos.Recurso;

/**
 *
 * @author Diana
 */

public interface Edificacion{
    public Edificacion crearEdificacion();
    public Recurso Almacena();
    public void seDestruye();
}
