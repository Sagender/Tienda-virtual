/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Complementos;

/**
 *
 * @author Daniel
 */
public class ComplementosController {
   public static Complementos ventana= new Complementos();
   
   public static void mostrar(){ ventana.setVisible(true);}
   public static void ocultar(){ ventana.setVisible(false);}
    
   public static void eventobtnregresarproductos(){
    ocultar();
    ProductoController.mostrar();
    
}
    public static void eventobtnregresarventas(){
    ocultar();
    VentaController.mostrar();
}
}
