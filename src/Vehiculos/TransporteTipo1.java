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
public class TransporteTipo1 implements Vehiculo {

    int cantInicial;
    String nombre;
    int precioEnAgua;
    int precioEnComida;
    int FasesGenerados;
    public ArrayList<TransporteTipo1> tipo1 = new ArrayList();

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
        return precioEnAgua;
    }

    public void setPrecioEnOro(int precioEnAgua) {
        this.precioEnAgua = precioEnAgua;
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
    //constructores

    public TransporteTipo1() {

    }

    public TransporteTipo1(String nombre, int cantInicial, int precioEnAgua, int precioEnComida, int FasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnAgua = precioEnAgua;
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
        this.setNombre("Transporte tipo 1");
        this.cantInicial = 1;
        this.precioEnAgua = 30;
        this.precioEnComida = 30;
        this.FasesGenerados = 2;

        TransporteTipo1 nuevoTransporte1 = new TransporteTipo1(nombre, cantInicial, precioEnAgua, precioEnComida, FasesGenerados);
        this.tipo1.add(nuevoTransporte1);
        System.out.println("TANQUE CREADO\n");

        return nuevoTransporte1;
    }
}