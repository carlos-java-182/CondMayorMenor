package mayorAMenor;

import javax.swing.JOptionPane;

public class TresNumerosMayorAMenor {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("Digita un n�mero"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Digita otro n�mero"));
		num3=Integer.parseInt(JOptionPane.showInputDialog("Digita un n�mero m�s"));
		
		if(num1>num2 && num2>num3) {
			JOptionPane.showConfirmDialog(null, "El orden de mayor a menor es: "+num1+"  "+num2+"  "+num3);
		}
		else if(num1>num3 && num3>num2) {
			JOptionPane.showConfirmDialog(null, "El orden de mayor a menor es: "+num1+"  "+num3+"  "+num2);
		}
		else if(num2>num3 && num3>num1) {
			JOptionPane.showConfirmDialog(null, "El orden de mayor a menor es: "+num2+"  "+num3+"  "+num1);
		}
		else if(num2>num1 && num1>num3) {
			JOptionPane.showConfirmDialog(null, "El orden de mayor a menor es: "+num2+"  "+num1+"  "+num3);
		}
		else if(num3>num2 && num2>num1){
			JOptionPane.showConfirmDialog(null, "El orden de mayor a menor es: "+num3+"  "+num2+"  "+num1);
		}
		else if(num3>num1 && num1>num2){
			JOptionPane.showConfirmDialog(null, "El orden de mayor a menor es: "+num3+"  "+num1+"  "+num2);
		}
		
	}

}
