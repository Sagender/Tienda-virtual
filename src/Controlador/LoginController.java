/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.VentanaLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class LoginController {
    public static VentanaLogin ventana =new VentanaLogin();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ventana.setVisible(false);}
    
    public static void eventoBtningresar(){
        String usuario = ventana.getTxtUsuario().getText();
        String password = ventana.getTxtPassword().getText();
        //usar clases del modelo
        if(usuario.equals("admin")&& password.equals("1234")){
            ocultar();
            PrincipalController.mostrar();
            JOptionPane.showMessageDialog(null, "Bienvenido");
            panel_control pc= new panel_control();
            pc.setVisible(true);
            this.dispose();
           }else{
            System.out.println(" Usuario o clave incorrecta");
            
        }
        
     
              
    }
    public static void eventoBtnSalir(){
        int ok = JOptionPane.showConfirmDialog(null, "¿Deseas Cerrar la ventana");
        if (JOptionPane.OK_OPTION == ok) {
            System.exit(0);                 
        }
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

