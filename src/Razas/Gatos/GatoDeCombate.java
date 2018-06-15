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
public class GatoDeCombate implements Raza {
    
    int vida = 1000;
    int danio = 350;
    public ArrayList<GatoDeCombate> GatoCombate = new ArrayList();

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

    public ArrayList<GatoDeCombate> getGatoCombate() {
        return GatoCombate;
    }

    public void setGatoCombate(ArrayList<GatoDeCombate> GatoCombate) {
        this.GatoCombate = GatoCombate;
    }
    //constructor
    public GatoDeCombate(){
        
    }
    
    public GatoDeCombate(int vida, int danio){
        this.vida = vida;
        this.danio = danio;
        
    }
    
    @Override
    public int ataca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public Raza seCrea() {
    this.setDanio(danio);
    this.setVida(vida);
    
    GatoDeCombate nuevoGatoC = new GatoDeCombate(vida, danio);
    this.GatoCombate.add(nuevoGatoC);
    
    return nuevoGatoC;
    }
    
}
