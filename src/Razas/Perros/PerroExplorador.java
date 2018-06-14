/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas.Perros;

import Razas.Raza;
import java.util.ArrayList;

/**
 *
 * @author Diana
 */
public class PerroExplorador implements Raza {
    int vida = 1500;
    int danio = 400;
    public ArrayList<PerroExplorador> perroE = new ArrayList();

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

    public ArrayList<PerroExplorador> getperroE() {
        return perroE;
    }

    public void setPerroE(ArrayList<PerroExplorador> perroE) {
        this.perroE = perroE;
    }
    //constructores
    public PerroExplorador(){
        
    }
    public PerroExplorador(int vida, int danio){
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
    
    PerroExplorador nuevoPerroE = new PerroExplorador(vida, danio);
    this.perroE.add(nuevoPerroE);
    return nuevoPerroE;
    }
}
