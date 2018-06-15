/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas.Loros;

import Razas.Raza;
import java.util.ArrayList;

/**
 *
 * @author Diana
 */
public class LoroGuardian implements Raza {
   
    int vida = 1500;
    int danio = 400;
    public ArrayList<LoroGuardian> LoroG = new ArrayList();

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

    public ArrayList<LoroGuardian> getLoroG() {
        return LoroG;
    }

    public void setLoroC(ArrayList<LoroGuardian> LoroG) {
        this.LoroG = LoroG;
    }
    //constructores
    public LoroGuardian(){
        
    }
    public LoroGuardian(int vida, int danio){
        this.vida = vida;
        this.danio = danio;
    }
   
    @Override
    public int ataca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Raza seCrea() {
    this.setVida(vida);
    this.setDanio(danio);
    
    LoroGuardian nuevoLoroG = new LoroGuardian(vida, danio);
    this.LoroG.add(nuevoLoroG);
    return nuevoLoroG;
    }
}
