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
public class LoroDeCombate implements Raza {
    
    int vida = 1500;
    int danio = 400;
    public ArrayList<LoroDeCombate> LoroC = new ArrayList();

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

    public ArrayList<LoroDeCombate> getLoroC() {
        return LoroC;
    }

    public void setLoroC(ArrayList<LoroDeCombate> LoroC) {
        this.LoroC = LoroC;
    }
    //constructores
    public LoroDeCombate(){
        
    }
    public LoroDeCombate(int vida, int danio){
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
    
    LoroDeCombate nuevoLoroC = new LoroDeCombate(vida, danio);
    this.LoroC.add(nuevoLoroC);
    return nuevoLoroC;
    
    }

   
}
