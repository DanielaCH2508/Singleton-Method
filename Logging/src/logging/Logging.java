/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logging;

/**
 *
 * @author ASUS PC
 */
public class Logging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Usuario u = Usuario.getUsuario("Andrea","Castro");
        Usuario u1 = Usuario.getUsuario(" fg","fg");
        System.out.println("Usuario: "+u1.getNombreUsuario()+" "+ u1.getApellidoUsuario());
        

    }

}
