/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;


/**
 *
 * @author Diana
 */
public class VehiculoFactory {
    public Vehiculo creaVehiculo(int v){
        switch(v){
            case 1:
                return new AvionFactory();
            case 2:
                return new TanqueFactory();
            case 3:
                return new TransporteTipo1Factory();
            case 4:
                return new TransporteTipo2Factory();
        }
        return null;
    }
    
}
