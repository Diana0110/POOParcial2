/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas.Gatos;

import Razas.Raza;
import java.util.ArrayList;

/**
 *
 * @author Diana
 */
public class GatoExplorador implements Raza {
    
    int vida = 600;
    int danio = 150;
    public ArrayList<GatoExplorador> GatoExplorador = new ArrayList();

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public ArrayList<GatoExplorador> getGatoExplorador() {
        return GatoExplorador;
    }

    public void setGatoExplorador(ArrayList<GatoExplorador> GatoExplorador) {
        this.GatoExplorador = GatoExplorador;
    }
    
    //constructores
    public GatoExplorador(){
        
    }
    public GatoExplorador(int vida, int danio){
        this.vida = vida;
        this.danio = danio;
    }
    
    @Override
    public int Vida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ataca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void evoluciona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Raza seCrea() {
        this.setVida(vida);
        this.setDanio(danio);
        
        GatoExplorador nuevoGatoE = new GatoExplorador(vida, danio);
        this.GatoExplorador.add(nuevoGatoE);
        
        return nuevoGatoE;
    }
}
