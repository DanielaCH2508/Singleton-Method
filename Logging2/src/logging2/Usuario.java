/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logging2;


/**
 *
 * @author ASUS PC
 */
public class Usuario {

    private static Usuario usuario = new Usuario();

    private Usuario() {
    }

    public static Usuario getUsuario() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

    public void getRegistro(String nombreU, String apellidoU) {
        System.out.println("Usuario:" + nombreU + apellidoU);
    }

}
