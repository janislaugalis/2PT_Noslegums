import java.util.Scanner;
import javax.swing.JOptionPane;

public class uzdevums {

	public static void main(String[] args) {
		int x=0;
		int y;
		int x1=0, x2=0, x3=0, x4=0, x5=0, x6=0, x7=0, x8=0, x9=0, x10=0;
		int punkti=10;
		Scanner scan = new Scanner(System.in);
		
		do{ // jaut�jumu sazarojums
			x = Integer.parseInt(JOptionPane.showInputDialog("K�d�s situ�cij�s izmanto If Else sazarojumu? \n1. Ja ir vair�kas situ�cijas. \n2. Ja programm� ir k��das.  \n3. Ja programma pieprasa semikolu \n4. Ja programm� ir ievietots �Scanner� ")); // nosac�jums
			y = 1; //atbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m��ini v�lreiz ---");
				x1 = 1;
			}
		}while(x!=y);

	}

}
