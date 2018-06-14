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
public class GatoGuardian implements Raza {

    int vida = 800;
    int danio = 100;
    public ArrayList<GatoGuardian> GatoCombate = new ArrayList();

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

    public ArrayList<GatoGuardian> getGatoCombate() {
        return GatoCombate;
    }

    public void setGatoCombate(ArrayList<GatoGuardian> GatoCombate) {
        this.GatoCombate = GatoCombate;
    }
    //constructor
    public GatoGuardian (int vida, int danio){
        this.vida=vida;
        this.danio=danio;
    }
    public GatoGuardian(){
        
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
    
    GatoGuardian nuevoGatoG = new GatoGuardian(vida, danio);
    this.GatoCombate.add(nuevoGatoG);
    
    return nuevoGatoG;
    }

}
