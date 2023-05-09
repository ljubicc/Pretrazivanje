package binarysearch;

/*
 * 
 * Sustina pretrage je da stalno trazimo sredinu niza i u skladu sa mestom gde se nalazi trazena vrednost,
 * levo ili desno od sredine niza,
 * pomeramo krajeve niza odnosno smanjujemo polje pretrage
 */

public class Main {
	
	// metodi prosedjujemo niz i trazeni element u nizu
	public static int pretrazi(int[] niz, int element) {
		int l = 0; // inicijalizujemo promenljivu koja predstavlja levi kraj niza
		int r = niz.length - 1; //inicijalizujemo promenljivu koja predstavlja desni kraj niza
		int mid; // promenljiva predstavlja sredinu izmedju levog i desnog kraja niza
		while (l <= r) { // 
			
			mid = (l + r) / 2; // trazimo sredinu niza

			if (element == niz[mid]) { // provera da li smo nasli element
				return mid; // ako jesmo vrati index nadjenog elementa
			} else if (element < niz[mid]) { // ako je element manji od vredosti sredine niza
				r = mid - 1; // pomeramo desni kraj niza za 1 mesto levo od sredine niza (smanjujemo niz)
			} else {
				l = mid + 1; // ako je element veci od vrednosti sredine niza, pomeramo levi kraj niza 
				             // za 1 mesto udesno od sredine niza
			}
		}
		return -1; // levi kraj niza je presao preko desnog kraja niza ( element ne postoji u nizu)
	}

	public static void main(String[] args) {
		// primer niza
		int[] niz = { 4, 7, 10, 11, 15, 24, 27, 30, 32, 33 };
		// trazeni podatak u nizu
		int podatak = 27;

		
		// smestamo rezultat pretrage u promenljivu
		int rez = pretrazi(niz, podatak);
		
		// stampamo rezultat pretrage
		if (rez != -1) {
			System.out.println("Index trazenog podatka je " + rez);
		} else {
			System.out.println("Trazeni podatak " + podatak + " se ne nalazi u nizu");
		}

	}

}
