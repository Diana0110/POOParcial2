/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones.Contenedores;

import Edificaciones.Edificacion;
import java.util.ArrayList;
import Recursos.Recurso;

/**
 *
 * @author Diana
 */
public class ContenedorVehiculos implements Edificacion {
    int cantInicial;
    String nombre;
    int precioEnAgua;
    int precioEnComida;
    int FasesGenerados;//mas caro

    public ArrayList<ContenedorVehiculos> contVehiculo = new ArrayList();

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

    public int getPrecioEnAgua() {
        return precioEnAgua;
    }

    public void setPrecioEnAgua(int precioEnAgua) {
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
    public ContenedorVehiculos() {

    }

    public ContenedorVehiculos(String nombre, int cantInicial, int precioEnAgua, int precioEnComida, int FasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnComida = precioEnComida;
        this.precioEnAgua = precioEnAgua;
        this.FasesGenerados = FasesGenerados;
    }

    @Override
    public Edificacion crearEdificacion() {
        this.setNombre("Contendor de Vehiculos");
        this.precioEnComida = 60;
        this.precioEnAgua = 75;
        this.cantInicial = 0;
        this.FasesGenerados = 4;

        ContenedorVehiculos nuevoContVehiculos = new ContenedorVehiculos(nombre, cantInicial, precioEnComida, precioEnAgua, FasesGenerados);
        this.contVehiculo.add(nuevoContVehiculos);

        return nuevoContVehiculos;
    }

    @Override
    public Recurso Almacena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seDestruye() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
