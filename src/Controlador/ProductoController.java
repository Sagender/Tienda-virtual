/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import Vista.VentanaProductos;

/**
 *
 * @author Daniel
 */
public class ProductoController {
    public static VentanaProductos ventana =new VentanaProductos();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ventana.setVisible(false);}
    
    public static void eventoBtnretornarprincipal() {
   ocultar();
   PrincipalController.mostrar();
    }

    public static void eventoBtnretornarventa() {
       ocultar();
       VentaController.mostrar();
    }
    public static void eventoirHamburguesa(){
        ocultar();
        HamburguesaController.mostrar();
        
    }
    public static void eventoirbebidas(){
        ocultar();
        BebidasController.mostrar();
        
    }
     public static void eventoirhelados(){
        ocultar();
        HeladoController.mostrar();
        
    }
      public static void eventoircomplementos(){
        ocultar();
        ComplementosController.mostrar();
        
    }
   
  
   
}
