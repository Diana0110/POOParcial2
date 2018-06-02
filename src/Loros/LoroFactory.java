/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loros;

import Gatos.Gato;
import Perros.Perro;
import Razas.Raza;

/**
 *
 * @author Diana
 */
public class LoroFactory implements Raza {

    @Override
    public Perro crearPerro(int p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Gato crearGato(int g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loro crearLoro(int l) {
        switch (l) {
            case 1:
                return new LoroDeCombate();
            case 2:
                return new LoroExplorador();
            case 3:
                return new LoroGuardian();
        }
        return null;
    }
}