package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu a = new menu(0);
		String user = "usuario";
        String pass = "contraseña";
        Scanner scan = new Scanner(System.in);

        int count = 0;
        while ( count< 3) {
            //System.out.println("Ingresa tu nombre de usuario:");
        	 String name = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
           
            String contra = JOptionPane.showInputDialog(null, "Ingrese la contraseña:");

            if (name.equalsIgnoreCase(user) && contra.equalsIgnoreCase(pass)) {
            	JOptionPane.showMessageDialog(null, "Hola rey o reinota, Bienvenido :b !");
            	int op = 0 ;
                menu.menu_principal(op);
                            
                break;
            } else {
                count++;
                JOptionPane.showMessageDialog(null, "Usuario contraseña incorrecta."+"\n"+"Intenta de nuevo!");
                if (count == 3) {
                	JOptionPane.showMessageDialog(null, " Has agotado tus intentos. Programa finalizado.");
                
                }
            }
        }
        scan.close();
	}

}
