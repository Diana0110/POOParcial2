/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

/**
 *
 * @author Diana
 */
public interface Edificacion {
    public Edificacion seConstruye();
    public void vida();
    public Recurso almacena();
    public Vehiculo construyeVehiculo();
    public Soldado entrenaSoldados();
    
}
