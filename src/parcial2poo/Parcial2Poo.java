/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2poo;

//import Jugadores.AdminFasesConstruccion;
//import Jugadores.Administrador;
import Jugadores.Usuario;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class Parcial2Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("| ** ANIMAL'S WAR  ** |\n");

        System.out.println("Jugador 1:");
        Usuario jugador1 = new Usuario();
        Usuario jugador01 = jugador1.creacionJugador();

        System.out.println("Jugador 2:");
        Usuario jugador2 = new Usuario();
        Usuario jugador02 = jugador2.creacionJugador();
        jugador02.setEstado(false);

        Usuario admin = new Usuario();
        admin.Turno(jugador1, jugador2);
        
        admin.muestraAcciones(jugador01, jugador02);

        /*Scanner entrada = new Scanner(System.in);
        
        
        //Ingresa a la fabrica de Razas
        System.out.println("Escoga una raza: | 1.Perro | 2.Gato | 3. Loro |");
        int a = entrada.nextInt();
        RazaFactory raza = new RazaFactory();
        raza.crearRaza(a);
        
        System.out.println("Que recurso desea comprar: | 1. Agua | 2. Comida | 3. Oro |");
        int b = entrada.nextInt();
        RecursosFactory recurso = new RecursosFactory();
        recurso.creaRecursos(b);*/

 /*Administrador j1 = new Administrador();

        System.out.println("Alias: ");
        String alias1 = entrada.nextLine();
        j1.setAlias(alias1);
        int id1 = j1.getIdentificador1();
        j1.setIdentificador(id1);
        System.out.println("Administrador: " + id1);

        Administrador j2 = new Administrador();

        System.out.println("Alias: ");
        String alias2 = entrada.nextLine();
        j2.setAlias(alias2);
        int id2  = j2.getIdentificador2(id1);
        j2.setIdentificador(id2);
        System.out.println("Administrador: " + id2); */
 /*Acciones acciones = new Acciones();
        
        acciones.selectRaza();
        //System.out.println("Ingrese accion");
        //int p = entrada.nextInt();
        acciones.muestraAcciones();
        AdministradorFases admin = new AdministradorFases();
        admin.getCantFases();
        admin.getCantTurnos();*/
    }
}
