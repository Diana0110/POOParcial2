/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perros;

import Razas.Raza;

/**
 *
 * @author Diana
 */
public class PerroFactory implements Raza {

    @Override
    public Perro crearPerro(int p) {
        switch (p) {
            case 1:
                return new PerroDeCombate();
            case 2:
                return new PerroExplorador();
            case 3:
                return new PerroGuardian();

        }
        return null;//RECORDATORIO EN LUGAR DE SOLO RETORNAR NULL LANZAR UNA EXCEPCION 
    }

    @Override
    public Gato crearGato(int g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loro crearLoro(int l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
