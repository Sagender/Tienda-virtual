/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaVenta;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Daniel
 */
public class VentaController {
    public static VentanaVenta ventana =new VentanaVenta();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ventana.setVisible(false);}
   public static void eventobtnRetornar(){
   ocultar();
   PrincipalController.mostrar(); //permite el retorno a la VentanaPrincipal
   }
   public static void eventobtnverproductos(){
   ocultar();
   ProductoController.mostrar(); //permite el retorno a la VentanaPrincipal
   }
   
    

}
