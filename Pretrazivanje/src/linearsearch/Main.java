package linearsearch;

public class Main {

	public static void main(String[] args) {

		// primer niza celobrojnih vrednosti
		int[] niz = { 3, 6, 10, 23, 7, 23, 15 };

		// trazeni podatak
		int podatak = 17;

		boolean postoji = false;
		// pomeramo se po jedno mesto u nizu od prvog do poslednjeg elementa
		for (int i = 0; i < niz.length; i++) {
			// poredimo element u nizu sa trazenim elementom
			if (niz[i] == podatak) {
				// kada smo pronasli element ispisujemo index na kom se nalazi trazena vrednost
				System.out.println("Indeks trazenog elementa je " + i);
				// menjamo vrednost logicke promenljive
				postoji = true;
				// prekidamo petlju, nasli smo vrednost
				break;
			}
		}
		// ispisujemo poruku u slucaju da trazena vrednost ne postoji u nizu
		if (!postoji) {
			System.out.println("Element vrednosti " + podatak + " ne postoji u nizu.");
		}

	}

}
