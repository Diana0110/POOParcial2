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
public class EdificacionFactory implements Edificacion {

    /**
     *
     * @param e
     * @return
     * @throws ErrorDeCreacion
     */
    @Override
    public Edificacion seConstruye(int e) {
        switch (e) {
            case 1:
                return new ContenedorDeAgua();
            case 2:
                return new ContenedorDeComida();
            case 3:
                return new ContenedorDeOro();
            case 4:
                return new ContenedorDeMilicia();
            case 5:
                return new ContenedorDeVehiculos();
        }
        ErrorDeCreacion();//probar si funciona hacerlo con todas las factory
        return null;
    }

    @Override
    public void vida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Recurso almacena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculo construyeVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Soldado entrenaSoldados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ErrorDeCreacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
