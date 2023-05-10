package main;

import javax.swing.JOptionPane;

public class menu {
int opc;

public menu(int opc) {
	this.opc = opc;
}

public int getOpc() {
	return opc;
}

public void setOpc(char opc) {
	this.opc = opc;
}
public static int menu_principal(int opc) {
	//JOptionPane.showMessageDialog(null, "1.Balance general"+"\n"+"2.Estado de resultado"+"3.Nomina"+"\n"+"4.Salir");
	int opc1=Integer.parseInt(JOptionPane.showInputDialog(null, "Menu:"+"\n"+"1.Balance general"+"\n"+"2.Estado de resultado"+"\n"+"3.Nomina"+"\n"+"4.Salir"+"\n"+"Ingrese la opcion:"));
	switch(opc1) {
	case 1:
		mostrar();
		break;
	case 2:
		mostrar();
		break;
	case 3:
		mostrar();
		break;
	case 4:
		mostrar();
		break;
	default:
		mostrar();
		break;
	}
	
	
	return opc1;
}
public static void mostrar() {
	JOptionPane.showMessageDialog(null, "Ingrese activos"+",Ingrese pasivos,"+"Ingrese capital");
}
}
