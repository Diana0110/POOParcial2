/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugadores;

import Edificaciones.EdificacionFactory;
import Milicia.MiliciaFactory;
import Razas.Raza;
import Razas.RazaFactory;
import Recursos.Agua;
import Recursos.Comida;
import Recursos.Oro;
import Recursos.Recurso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class Usuario {

    String alias;
    Raza raza;
    int cantFases = 1;
    int FasesTotales = 1;
    int cantTurnos = 1;
    Usuario jugadorActivo, jugadorInactivo;
    boolean estado = false;
    int aguaInicial = 300, comidaInicial = 300, oroInicial = 300;

    public ArrayList<Usuario> usuario = new ArrayList(); //Lista donde se guardan los de los jugadores
    public ArrayList<Recurso> aguaTotal = new ArrayList();
    public ArrayList<Recurso> comida = new ArrayList();
    public ArrayList<Recurso> oro = new ArrayList();

    //Constructor USUARIO  - JUGADOR
    public Usuario() {

    }

    public Usuario(Usuario activo, Usuario inactivo) {

    }

    public Usuario(String alias, Raza raza, boolean estado, int cantTurnos, int aguaInicial, int comidaInicial, int oroInicial) {
        this.alias = alias;
        this.raza = raza;
        this.estado = estado;
        this.cantTurnos = cantTurnos;
        this.aguaInicial = aguaInicial;
        this.comidaInicial = comidaInicial;
        this.oroInicial = oroInicial;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getCantFases() {
        return cantFases;
    }

    public void setCantFases(int cantFases) {
        this.cantFases = cantFases;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCantTurnos() {
        return cantTurnos;
    }

    public void setCantTurnos(int cantTurnos) {
        this.cantTurnos = cantTurnos;
    }

    public Usuario getJugadorActivo() {
        return jugadorActivo;
    }

    public void setJugadorActivo(Usuario jugadorActivo) {
        this.jugadorActivo = jugadorActivo;
    }

    public Usuario getJugadorInactivo() {
        return jugadorInactivo;
    }

    public void setJugadorInactivo(Usuario jugadorInactivo) {
        this.jugadorInactivo = jugadorInactivo;
    }

    public int getFasesTotales() {
        return FasesTotales;
    }

    public void setFasesTotales(int FasesTotales) {
        this.FasesTotales = FasesTotales;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Recurso> getAgua() {
        return aguaTotal;
    }

    public void setAgua(ArrayList<Recurso> aguaTotal) {
        this.aguaTotal = aguaTotal;
    }

    public ArrayList<Recurso> getComida() {
        return comida;
    }

    public void setComida(ArrayList<Recurso> comida) {
        this.comida = comida;
    }

    public ArrayList<Recurso> getOro() {
        return oro;
    }

    public void setOro(ArrayList<Recurso> oro) {
        this.oro = oro;
    }

    public int getAguaInicial() {
        return aguaInicial;
    }

    public void setAguaInicial(int aguaInicial) {
        this.aguaInicial = aguaInicial;
    }

    public int getComidaInicial() {
        return comidaInicial;
    }

    public void setComidaInicial(int comidaInicial) {
        this.comidaInicial = comidaInicial;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public int getOroInicial() {
        return oroInicial;
    }

    public void setOroInicial(int oroInicial) {
        this.oroInicial = oroInicial;
    }

    //metodos
    Scanner entrada = new Scanner(System.in);

    public Raza selectRaza() {
        System.out.println("Escoga una raza: | 1.Perro | 2.Gato | 3. Loro |");
        int a = entrada.nextInt();
        RazaFactory raza = new RazaFactory();
        return raza.crearRaza(a);
    }

    //se encarga de pedir los datos basicos del jugador
    public Usuario creacionJugador() {
        System.out.println("Alias: ");
        this.setAlias(entrada.nextLine());
        //Jugador selecciona raza
        this.setRaza(selectRaza());
        //La creacion del usuario no cuenta como turno. El turno inicia cuando el jugador realiza su primera accion
        this.setCantTurnos(1);
        //el estado del jugador es 'activo' esto le permite empezar a jugar al finalizar su inscripcion 
        this.setEstado(true);
        this.setAguaInicial(aguaInicial);

        //nombre, cantidad, precioEnOro, precioEnComida, FasesRecoleccion, FasesGenerados
        Usuario nuevoUsuario = new Usuario(alias, raza, estado, cantTurnos, aguaInicial, comidaInicial, oroInicial);
        //Los datos del jugador son almacenados en un arraylist
        this.usuario.add(nuevoUsuario);

        return nuevoUsuario;
    }

    public int cuentaTurnos(boolean estado) {
        if (estado == false) {
            cantTurnos++;
        }
        return cantTurnos;
    }

    public void Turno(Usuario jugador01, Usuario jugador02) {
        //Verifica cual de los dos jugadores esta en turno activo  
        if (jugador01.isEstado() == true) { //si el usuario 1 esta activo juega
            this.setJugadorActivo(jugador01);
            System.out.println("| TURNO DE: " + jugadorActivo.getAlias() + "|");
        } else {
            this.setJugadorActivo(jugador02);
            System.out.println("|"
                    + " TURNO DE: " + jugadorActivo.getAlias() + "|");
        }
    }

    public int cuentaFases(int Fase) {
        if (Fase % 2 == 0) {
            cantFases++;
            FasesTotales++;
        }
        return cantFases;
    }

    public void muestraAcciones(Usuario jugadorActivo, Usuario jugadorInactivo) {
        System.out.println("TURNO: " + jugadorActivo.getCantTurnos());
        System.out.println("FASE: " + this.getFasesTotales() + "\n");

        System.out.println("Agua: " + jugadorActivo.getAguaInicial());
        System.out.println("Comida: " + jugadorActivo.getComidaInicial());
        System.out.println("Oro: " + jugadorActivo.getOroInicial() + "\n");

        System.out.println("Que desea hacer?:\n"
                + "1. Obtener recurso\n"
                + "2. Comprar recursos\n"
                + "3. Entrenar tropas\n"
                + "4. Construir Edificacion\n"
                + "5. Atacar\n"
                + "6. Defenderse\n"
                + "7. Terminar turno\n");
        int a = entrada.nextInt();
        switch (a) {
            case 1:
                System.out.println("Ingrese el recurso que desea:\n"
                        + "1. Agua | 2. Comida |  3.Oro");
                int r = entrada.nextInt();
                switch (r) {
                    case 1:
                        Agua ag = new Agua();
                        int AguaRequerida = ag.crearRecurso(this.comidaInicial, this.oroInicial);
                        int nueva = this.aguaInicial + AguaRequerida;
                        int nuevaComida = this.comidaInicial - (AguaRequerida * 2);
                        this.comidaInicial = nuevaComida;
                        int nuevoOro = this.oroInicial - (AguaRequerida * 2);
                        this.aguaInicial = nueva;
                        jugadorActivo.setComidaInicial(nuevaComida);
                        jugadorActivo.setOroInicial(nuevoOro);
                        jugadorActivo.setAguaInicial(nueva);
                        break;
                    case 2:
                        Comida cm = new Comida();
                        int ComidaRequerida = cm.crearRecurso(this.aguaInicial, this.oroInicial);
                        int nuevaC = this.comidaInicial + ComidaRequerida;
                        int nuevaAgua = this.aguaInicial - (ComidaRequerida * 2);
                        this.aguaInicial = nuevaAgua;
                        int nuevoO = this.oroInicial - (ComidaRequerida * 2);
                        this.aguaInicial = nuevaC;
                        jugadorActivo.setAguaInicial(nuevaAgua);
                        jugadorActivo.setOroInicial(nuevoO);
                        jugadorActivo.setComidaInicial(nuevaC);
                        break;
                    case 3:
                        Oro or = new Oro();
                        int OroRequerida = or.crearRecurso(this.aguaInicial, this.oroInicial);
                        int nuevoOr = this.oroInicial + OroRequerida;
                        int nuevaAgu = this.aguaInicial - (OroRequerida * 2);
                        this.aguaInicial = nuevaAgu;
                        int nuevaCo = this.comidaInicial - (OroRequerida * 2);
                        this.aguaInicial = nuevaAgu;
                        jugadorActivo.setAguaInicial(nuevaAgu);
                        jugadorActivo.setComidaInicial(nuevaCo);
                        jugadorActivo.setOroInicial(nuevoOr);
                        break;
                }

                /*Si para regresar al menu principal sin alterar las fases ni la cantidad de turnos*/
                jugadorActivo.setEstado(true);
                jugadorInactivo.setEstado(false);//jugador inactivo pasa a estar activo
                Turno(jugadorActivo, jugadorInactivo);
                muestraAcciones(jugadorActivo, jugadorInactivo);
                break;
            case 2:
            case 3:
                System.out.println("factory tropas");
                MiliciaFactory milicia = new MiliciaFactory();
                milicia.creaSoldado();

                jugadorActivo.setEstado(true);
                jugadorInactivo.setEstado(false);//jugador inactivo pasa a estar activo
                Turno(jugadorActivo, jugadorInactivo);
                muestraAcciones(jugadorActivo, jugadorInactivo);
                break;
            case 4:
                EdificacionFactory edificacion = new EdificacionFactory();
                edificacion.creaEdificacion();

                jugadorActivo.setEstado(true);
                jugadorInactivo.setEstado(false);//jugador inactivo pasa a estar activo
                Turno(jugadorActivo, jugadorInactivo);
                muestraAcciones(jugadorActivo, jugadorInactivo);
                break;
            case 5:
                System.out.println("metodo atacar");
                break;
            case 6:
                System.out.println("metodo defenderse");
                break;
            case 7:
                System.out.println("Terminar turno");
                System.out.println("Seguro seguro que desea terminar su turno?"
                        + "| 1. SI | 2. NO |");
                int opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        jugadorActivo.setEstado(false);
                        cantTurnos = jugadorActivo.cuentaTurnos(estado);
                        int Fase = (jugadorActivo.cantTurnos + jugadorInactivo.cantTurnos);
                        cuentaFases(Fase);
                        jugadorInactivo.setEstado(true);//jugador inactivo pasa a estar activo
                        Turno(jugadorActivo, jugadorInactivo);
                        muestraAcciones(jugadorInactivo, jugadorActivo);
                        break;
                    case 2:
                        jugadorActivo.setEstado(estado);
                        Turno(jugadorActivo, jugadorInactivo);
                        muestraAcciones(jugadorActivo, jugadorInactivo);
                        break;
                    default:
                        //Si el usuario ingresa un numero que no esta en la lista el menu vuelve a aparecer
                        System.out.println("Error al escoger la accion. Intende de nuevo");
                        Turno(jugadorActivo, jugadorInactivo);
                        muestraAcciones(jugadorActivo, jugadorInactivo);
                        break;
                }
        }
    }
}
