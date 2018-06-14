/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones.Contenedores;

import Edificaciones.Edificacion;
import Recursos.Recurso;
import java.util.ArrayList;

/**
 *
 * @author Diana
 */
public class ContenedorDeAgua implements Edificacion {
    int cantInicial;
    String nombre;
    int precioEnOro;
    int precioEnComida;
    int FasesGenerados;//mas caro

    public ArrayList<ContenedorDeAgua> contAgua = new ArrayList();

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

    //constructores
    public ContenedorDeAgua() {

    }

    public ContenedorDeAgua(String nombre, int cantInicial, int precioEnOro, int precioEnComida, int FasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnComida = precioEnComida;
        this.precioEnOro = precioEnOro;
        this.FasesGenerados = FasesGenerados;
    }

    @Override
    public Edificacion crearEdificacion() {
        this.setNombre("Contendor de Agua");
        this.precioEnComida = 60;
        this.precioEnOro = 75;
        this.cantInicial = 0;
        this.FasesGenerados = 2;

        ContenedorDeAgua nuevoContAgua = new ContenedorDeAgua(nombre, cantInicial, precioEnComida, precioEnOro, FasesGenerados);
        this.contAgua.add(nuevoContAgua);

        return nuevoContAgua;
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
