/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

import Milicia.Soldado;
import Recursos.Recurso;
import Vehiculos.Vehiculo;

/**
 *
 * @author Diana
 */
public interface Edificacion{
    public Edificacion seConstruye(int e);
    public void vida();
    public Recurso almacena();
    public Vehiculo construyeVehiculo();
    public Soldado entrenaSoldados();
    public void ErrorDeCreacion();
}
