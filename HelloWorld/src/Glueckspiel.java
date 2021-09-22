
public class Glueckspiel {

	static byte alter = 18;
	static byte geschlecht = 0;
	static String name = "Florian";
	static double randomValue = Math.random()*100;
	static int spieler1 = 49;
	static int spieler2 = 51;

	public static void main(String[] args) {
		if (alter < 18 || geschlecht == 2) {
			System.out.println("Hallo " + name + "!");
		} else {
			if (geschlecht == 0) {
				System.out.println("Guten Tag Herr " + name + "!");
			} else {
				if (geschlecht == 1) {
					System.out.println("Guten Tag Frau " + name + "!");
				}
			}
		}
		spieler1 = (int) (randomValue - spieler1);
		if (spieler1 < 0) {
			spieler1 = spieler1 - 2 * spieler1;
		}
		spieler2 = (int) (randomValue - spieler2);
		if (spieler2 < 0) {
			spieler2 = spieler2 - 2 * spieler2;
		}
		if (spieler1 == spieler2) {
			System.out.println("Unentschieden");
		} else {
			if (spieler1 > spieler2) {
				System.out.println("Spieler 2 gewinnt");
			} else {
				System.out.println("Spieler 1 gewinnt");
			}
		}halo

	}

}
