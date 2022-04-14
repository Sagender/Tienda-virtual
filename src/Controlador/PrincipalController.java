/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.Ventanaprincipal;
/**
 *
 * @author Daniel
 */
public class PrincipalController {
   public static Ventanaprincipal ventana= new Ventanaprincipal();
   public static void mostrar(){ ventana.setVisible(true);}
   public static void ocultar(){ ventana.setVisible(false);}
   public static void botonSalir(){
   ocultar();
   LoginController.mostrar();
   }
   public static void botonVenta(){
   ocultar();
   VentaController.mostrar();
   }
   public static void botonProductos(){
   ocultar();
   ProductoController.mostrar();
   }
}
    

