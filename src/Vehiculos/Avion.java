/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import java.util.ArrayList;

/**
 *
 * @author Diana
 */
public class Avion implements Vehiculo {

    int cantInicial;
    String nombre;
    int precioEnOro;
    int precioEnComida;
    int FasesGenerados;

    public ArrayList<Avion> avion = new ArrayList();

    public int getCantInicial() {
        return cantInicial;
    }

    public void setCantInicial(int cantInicial) {
        this.cantInicial = cantInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioEnOro() {
        return precioEnOro;
    }

    public void setPrecioEnOro(int precioEnOro) {
        this.precioEnOro = precioEnOro;
    }

    public int getPrecioEnComida() {
        return precioEnComida;
    }

    public void setPrecioEnComida(int precioEnComida) {
        this.precioEnComida = precioEnComida;
    }

    public int getFasesGenerados() {
        return FasesGenerados;
    }

    public void setFasesGenerados(int FasesGenerados) {
        this.FasesGenerados = FasesGenerados;
    }

    public ArrayList<Avion> getAvion() {
        return avion;
    }

    public void setAvion(ArrayList<Avion> avion) {
        this.avion = avion;
    }

    //constructores
    
    public Avion(){
        
    }
    public Avion(String nombre, int cantInicial, int precioEnOro, int precioEnComida, int FasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnOro = precioEnOro;
        this.precioEnComida = precioEnComida;
        this.FasesGenerados = FasesGenerados;
    }

    @Override

    public void ataca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seMueve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transporta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculo creaVehiculo() {
        this.setNombre("Avion");
        this.cantInicial = 1;
        this.precioEnOro = 200;
        this.precioEnComida = 100;
        this.FasesGenerados = 3;

        Avion nuevoAvion = new Avion(nombre, cantInicial, precioEnOro, precioEnComida, FasesGenerados);
        this.avion.add(nuevoAvion);
        System.out.println("AVION CREADO\n");

        return nuevoAvion;
    }

}
