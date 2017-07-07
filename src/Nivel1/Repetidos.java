package Nivel1;
/*
 * Deberá eliminar los caracteres repetidos en una cadena de la siguiente forma:
 * aaaayokokkoo tiene que quedar como ayokoko.
 */
public class Repetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("La cadena de entrada: aaaayokokkoo");
		System.out.println("La cadena resultado: " + Repetidos.SinRepetidosStrBldr("aaaayokokkoo"));
		
	}
	
	public static String SinRepetidosStrBldr (String str) {
		String resultado = "";
		StringBuilder s = new StringBuilder(str);
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				s.deleteCharAt(i+1);
				i--;
			}
		}
		resultado = s.toString();
		return resultado;
	}
}
