/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


/**
 *
 * @author nmoli
 */
import vista.Proveedores1;
import vista.maestro;
public class controladorMaestro {
    
    public static maestro ma = new maestro();
    public static void mostrar(){ma.setVisible(true);}
    public static void ocultar(){ma.setVisible(false);}

    public static void botonMaestro() {
        ma.setVisible(true);
    }

    public static void botonClientes() {
        
    }

    public static void botonProveedores() {
        
    }
    
    
}
