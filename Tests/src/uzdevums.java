
import java.util.Scanner;
import javax.swing.JOptionPane;

public class uzdevums {

	public static void main(String[] args) {
		int x=0;
		int y;
		int x1=0, x2=0, x3=0, x4=0, x5=0, x6=0, x7=0, x8=0, x9=0, x10=0;
		int punkti=10;
		Scanner scan = new Scanner(System.in);
		
		
		do{ // jaut?jumu sazarojums
			x = Integer.parseInt(JOptionPane.showInputDialog("K?d?s situ?cij?s izmanto IF ELSE sazarojumu? \n1. Ja ir vair?kas situ?cijas. \n2. Ja programm? ir k??das.  \n3. Ja programma pieprasa semikolu \n4. Ja programm? ir ievietots ?Scanner? ")); // nosac?jums
			y = 1; //atbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m??ini v?lreiz ---");
				x1 = 1;
			}
		}while(x!=y);
		
		do{
			x = Integer.parseInt(JOptionPane.showInputDialog("--- 2. K?da ir at??ir?ba no IF ELSE un Switch sazarojumiem? --- \n1. Switch ir ?rt?ks par IF ELSE \n2. Switch pieprasa ?s?ku pierakstu. \n3. Switch izmanto case un default, kam?r IF ELSE netiek tie izmantoti \n4. Visas atbildes ir pareizas. "));
			y = 4; //atbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m??ini v?lreiz ---");
				x2 = 1;
			}
		}while(x!=y);
		
		do{
			x = Integer.parseInt(JOptionPane.showInputDialog("--- 3. K?da ir at??ir?ba starp line?ru un sazarotu programmu?  --- \n1. Line?ra programma nesp?j izskat?t vair?kas situ?cijas, pret?ji sazarotai programmai. \n2. Line?ra programma veic tie?i to pa?u, ko sazarota programma \n3. Line?ra programma pied?v? vair?k iesp?jas \n4. Line?ra programmai liel?ks risks uz k??d?m. "));
			y = 1; //atbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m??ini v?lreiz ---");
				x3 = 1;
			}
		}while(x!=y);
		
		do{
			x = Integer.parseInt(JOptionPane.showInputDialog("--- 4. IF funkcija veic? --- \n1. Nov?rt?, vai izteiksme ir vien?da vai n?. \n2. Nov?rt?, vai izteiksme ir patiesa vai aplama \n3. Nov?rt?, vai izteiksme ir maz?ka vai liel?ka par skaitli \n4. Nov?rt?, vai String objekt? ir noteikti burti vai nav "));
			y = 2; //atbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m??ini v?lreiz ---");
				x4 = 1;
			}
		}while(x!=y);
		
		do{
			x = Integer.parseInt(JOptionPane.showInputDialog("--- 5. Vai ir iesp?jams lietot vair?kas IF funkcijas neizmantojot ELSE --- \n1. Tikai no 10.00 l?dz 17.00  \n2. N? \n3. J? \n4. Aizliegts pret likumu "));
			y = 3;//attbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m??ini v?lreiz ---");
				x5 = 1;
			}
		}while(x!=y);
		
		do{
			x = Integer.parseInt(JOptionPane.showInputDialog("--- 6. IF-ELSE arguments tiek ar? saukts par ?  --- \n1. Sazarojuma konstrukcija \n2. Mas?vu kontrukcija \n3. Bloksh?mu sazarojums \n4. Visi min?tie"));
			y = 1; //atbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m??ini v?lreiz ---");
				x6 = 1;
			}
		}while(x!=y);
		
		do{
			x = Integer.parseInt(JOptionPane.showInputDialog("--- 7. Ko sazarojuma komand? dr?kst izmantot k? nosac?jumu? --- \n1. jebkuru apgalvojumu, par kuru var pateikt, vai tas ir patiess vai nepatiess. \n2. Apgalvojumu, kur netiek nor?d?ts vai tas ir patiess vai nepatiess. \n3. Nav svar?gi vai ir patiess/nepatiess vai nav patiess/nepatiess \n4. Visas iepriek??j?s atbildes der."));
			y = 1; //atbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m??ini v?lreiz ---");
				x7 = 1;
			}
		}while(x!=y);
		
		do{
			x = Integer.parseInt(JOptionPane.showInputDialog("--- 8. Pirms else dr?kst lietot semikolu ?  --- \n1. Izmanto kolu (:), nevis semikolu  \n2. Nav svar?gi.  \n3. pirms else neliek semikolu \n4. else netiek lietots IF sazarojum? "));
			y = 3; //atbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m??ini v?lreiz ---");
				x8 = 1;
			}
		}while(x!=y);
		
		do{
			x = Integer.parseInt(JOptionPane.showInputDialog("--- 9. Cik Switch case?es maksimums var izmantot? --- \n1. Neierobe?oti \n2. 32 \n3. 64 \n4. Atkar?b? no oper?t?jsist?mas "));
			y = 1; //atbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m??ini v?lreiz ---");
				x9 = 1;
			}
		}while(x!=y);
		
		do{
			x = Integer.parseInt(JOptionPane.showInputDialog("--- 10. Ko Switch sazarojum? nor?da ?Default? ? --- \n1. Nor?da pret?ji case nosac?jumam. \n2. Nor?da, cik case ir sazarojum?. \n3. Nor?da IF funkcijas sazarojumus \n4. Nor?da, ka viss ir iestat?juma opcij?s "));
			y = 1; //atbilde
			if (x==y) {
				JOptionPane.showMessageDialog(null, "--- Pareizi ---");
			} else {
				JOptionPane.showMessageDialog(null, "--- Nepareizi, m??ini v?lreiz ---");
				x10 = 1;
			}
			}while(x!=y);
			scan.close();
			//nobeigums, punktu saskait??ana
			punkti = punkti - x1 - x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10;
			JOptionPane.showMessageDialog(null, "Ar pirmo reizi pareizi atbild?ts"+punkti+"/10");
			}
	}



	





