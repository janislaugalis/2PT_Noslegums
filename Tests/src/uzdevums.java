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
		
		do{
			x = Integer.parseInt(JOptionPane.showInputDialog("--- 2. K�da ir at��ir�ba no IF ELSE un Switch sazarojumiem? --- \n1. Switch ir �rt�ks par IF ELSE \n2. Switch izmanto case un default, kam�r IF ELSE netiek tie izmantoti. \n3. Switch izmanto case un default, kam�r IF ELSE netiek tie izmantoti \n4. Visas atbildes ir pareizas. "));
			y = 4; //atbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m��ini v�lreiz ---");
				x2 = 1;
			}
		}while(x!=y);
		
	
	do{
		x = Integer.parseInt(JOptionPane.showInputDialog("--- 3. K�da ir at��ir�ba starp line�ru un sazarotu programmu?  --- \n1. Line�ra programma nesp�j izskat�t vair�kas situ�cijas, pret�ji sazarotai programmai. \n2. Line�ra programma veic tie�i to pa�u, ko sazarota programma \n3. Line�ra programma pied�v� vair�k iesp�jas \n4. Line�ra programmai liel�ks risks uz k��d�m. "));
		y = 1; //atbilde
		if (x==y) {
			JOptionPane.showMessageDialog(null, "--- Pareizi ---");
		} else {
			JOptionPane.showMessageDialog(null, "--- Nepareizi, m��ini v�lreiz ---");
			x3 = 1;
		}
	}while(x!=y);
	do{
		x = Integer.parseInt(JOptionPane.showInputDialog("--- 4. If funkcija veic? --- \n1. Nov�rt�, vai izteiksme ir vien�da vai n�. \n2. Nov�rt�, vai izteiksme ir patiesa vai aplama \n3. Nov�rt�, vai izteiksme ir maz�ka vai liel�ka par skaitli \n4. Nov�rt�, vai String objekt� ir noteikti burti vai nav "));
		y = 2; //atbilde
		if (x==y) {
			JOptionPane.showMessageDialog(null, "--- Pareizi ---");
		} else {
			JOptionPane.showMessageDialog(null, "--- Nepareizi, m��ini v�lreiz ---");
			x4 = 1;
		}
	}while(x!=y);

	do{
		x = Integer.parseInt(JOptionPane.showInputDialog("--- 5. Vai ir iesp�jams lietot vair�kas if funkcijas neizmantojot else --- \n1. Tikai no 10.00 l�dz 17.00  \n2. N� \n3. J� \n4. Aizliegts pret likumu "));
		y = 3;//attbilde
		if (x==y) {
			JOptionPane.showMessageDialog(null, "--- Pareizi ---");
		} else {
			JOptionPane.showMessageDialog(null, "--- Nepareizi, m��ini v�lreiz ---");
			x5 = 1;
		}
	}while(x!=y);
	do{
		x = Integer.parseInt(JOptionPane.showInputDialog("--- 6. IF-ELSE arguments tiek ar� saukts par ?  --- \n1. Sazarojuma konstrukcija \n2. Mas�vu kontrukcija \n3. Bloksh�mu sazarojums \n4. Visi min�tie"));
		y = 1; //atbilde
		if (x==y) {
			JOptionPane.showMessageDialog(null, "--- Pareizi ---");
		} else {
			JOptionPane.showMessageDialog(null, "--- Nepareizi, m��ini v�lreiz ---");
			x6 = 1;
		}
	}while(x!=y);
	do{
		x = Integer.parseInt(JOptionPane.showInputDialog("--- 7. Ko sazarojuma komand� dr�kst izmantot k� nosac�jumu? --- \n1. jebkuru apgalvojumu, par kuru var pateikt, vai tas ir patiess vai nepatiess. \n2. Apgalvojumu, kur netiek nor�d�ts vai tas ir patiess vai nepatiess. \n3. Nav svar�gi vai ir patiess/nepatiess vai nav patiess/nepatiess \n4. Visas iepriek��j�s atbildes der."));
		y = 1; //atbilde
		if (x==y) {
			JOptionPane.showMessageDialog(null, "--- Pareizi ---");
		} else {
			JOptionPane.showMessageDialog(null, "--- Nepareizi, m��ini v�lreiz ---");
			x7 = 1;
		}
	}while(x!=y);
	}
}


