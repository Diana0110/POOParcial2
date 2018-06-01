/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author Diana
 */
public class RazaFactory implements Raza {
    public class RazaFactory {
    public Razas crearRaza(int a){
        switch(a){
            case 1:
                return new PerroFactory();
            case 2:
                return new GatoFactory();
            case 3:
                return new LoroFactory();
            
        }
        return null;
    }

}
    
}
