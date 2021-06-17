package curs2;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {

		/**
		 * facem un program care ne calculeaza un salariu.
		 * pe baza numarului lucrat de ore intr-o saptamana (nu permite overtime, deci max. 40 ore).
		 * inmultim nr de ore lucrate  cu salariul pe ora.
		 * Stim salariul pe ora, nu stim numarul de ore lucrate.
		 * Printam salariul.
		 */

		int numarMaxOreLucrate = 40;
		int salariuPeOra = 15;

		System.out.println("Cate ore ai lucrat sapatamana aceasta ?");
		Scanner scan = new Scanner(System.in);
		int oreLucrate = scan.nextInt();

		while (oreLucrate > numarMaxOreLucrate) {
			System.out.println("Numarul de ore nu ste corect. Te rog introdu un numar intre 1 si 40");
			oreLucrate = scan.nextInt();
		}
		scan.close();

		int salariu = oreLucrate * salariuPeOra;
		System.out.println("Salariul tau este: " + salariu + "$");
	}


}
