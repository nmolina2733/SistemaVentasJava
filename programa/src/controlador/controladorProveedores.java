/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.Proveedores1;

/**
 *
 * @author nmoli
 */
public class controladorProveedores {
    
    public static Proveedores1 pro = new Proveedores1();
    public static void mostrar(){pro.setVisible(true);}
    public static void ocultar(){pro.setVisible(false);}

    public static void botonProveedores1() {
        ocultar();
        mostrar();
    }

    public static void botonVolver() {
        ocultar();
        controladorMaestro.mostrar();
    }

      
    }
    
    

