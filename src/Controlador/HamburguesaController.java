/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Hamburguesas;

/**
 *
 * @author Daniel
 */
public class HamburguesaController {  
    public static Hamburguesas ventana= new Hamburguesas();
   
   public static void mostrar(){ ventana.setVisible(true);}
   public static void ocultar(){ ventana.setVisible(false);}
   
   public static void main(String[] args) {
        new Hamburguesas().setVisible(true);}
   
   
   public static void eventobtnregresarproductos(){
    ocultar();
    ProductoController.mostrar();
    
}
    public static void eventobtnregresarventas(){
    ocultar();
    VentaController.mostrar();
}
    
    
}
