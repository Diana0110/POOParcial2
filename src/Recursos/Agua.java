/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;
import Jugadores.Usuario;
import java.util.ArrayList;
/**
 *
 * @author Diana
 */
public class Agua implements Recurso {

    int cantInicial;
    String nombre;
    //Recurso tipo;
    int precioEnOro;
    int precioEnComida;
    int FasesRecoleccion; //por defecto
    int FasesGenerados;//mas caro
    
    public ArrayList<Agua> agua = new ArrayList();//Toda el agua se guarda en un array

    //constructor
    public Agua(){
        
    }
    
    public Agua(String nombre,int cantInicial, int precioEnOro, int precioEnComida, int FasesRecoleccion, int FasesGenerados) {
        this.nombre = nombre;
        this.cantInicial = cantInicial;
        this.precioEnOro = precioEnOro;
        this.precioEnComida = precioEnComida;
        this.FasesRecoleccion = FasesRecoleccion;
        this.FasesGenerados = FasesGenerados;
    }

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

    public int getFasesRecoleccion() {
        return FasesRecoleccion;
    }

    public void setFasesRecoleccion(int FasesRecoleccion) {
        this.FasesRecoleccion = FasesRecoleccion;
    }

    public int getFasesGenerados() {
        return FasesGenerados;
    }

    public void setFasesGenerados(int FasesGenerados) {
        this.FasesGenerados = FasesGenerados;
    }

    @Override
    public void comprarRecurso(Recurso oro, Recurso comida) {
        
        System.out.println("Ya hay agua");
    }

    @Override
    public Recurso crearRecurso() {
        this.setNombre("Agua");
        this.precioEnOro = 100;
        this.cantInicial = 300;
        this.precioEnComida = 75;
        this.FasesRecoleccion = 2;//dos fases
        this.FasesGenerados = 1;//una fase
        
        Agua nuevaAgua = new Agua(nombre, cantInicial, precioEnOro, precioEnComida,FasesRecoleccion,FasesGenerados);
        this.agua.add(nuevaAgua);
        System.out.println("AGUA CREADA");
        return nuevaAgua;
    }

}
