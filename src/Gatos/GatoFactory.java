/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gatos;

import Perros.Perro;
import Razas.Raza;

/**
 *
 * @author Diana
 */
public class GatoFactory implements Raza {

    @Override
    public Gato crearGato(int g) {
        switch (g) {
            case 1:
                return new GatoDeCombate();
            case 2:
                return new GatoExplorador();
            case 3:
                return new GatoGuardian();
        }
        return null;
    }

    @Override
    public Perro crearPerro(int p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loro crearLoro(int l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
