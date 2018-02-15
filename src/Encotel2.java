import java.util.Scanner;

public class Encotel2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			System.out.println(retorno(s.next()));
		}
	}

	public static String retorno(String letra) {

		String l = letra;
		char e;
		String palavra = "";
		for (int i = 0; i < l.length(); i++) {
			
			e = l.charAt(i);

			if (e >= 65 && e <= 67) {
				palavra += "2";
			} else if (e >= 68 && e <= 70) {
				palavra += "3";
			} else if (e >= 71 && e <= 73) {
				palavra += "4";
			} else if (e >= 74 && e <= 76) {
				palavra += "5";
			} else if (e >= 77 && e <= 79) {
				palavra += "6";
			} else if (e >= 80 && e <= 83) {
				palavra += "7";
			} else if (e >= 84 && e <= 86) {
				palavra += "8";
			} else if (e >= 87 && e <= 90) {
				palavra += "9";
			} else if (e == 49) {
				palavra += "1";
			} else if (e == 45) {
				palavra += "-";
			}
		}	return palavra;
	
	}
}
