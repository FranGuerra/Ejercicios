package Nivel1;
/*
 * Devuelve TRUE si tiene duplicados o false en caso contrario.
 */
public class Duplicados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("[] -> " + Duplicados.TieneDuplicados(new int[] {}));
		System.out.println("[0,1,4,6,7,6] -> " + Duplicados.TieneDuplicados(new int[] {0,1,4,6,7,6}));
		System.out.println("[0,1,2,3,4,5,6] -> " + Duplicados.TieneDuplicados(new int[] {0,1,2,3,4,5,6}));
		System.out.println("[1,4,6,4,7] -> " + Duplicados.TieneDuplicados(new int[]{1,4,6,4,7}));

	}

	public static boolean TieneDuplicados (int[] vec) {
		boolean resul = false;
		int numero;
		for(int i = 0; i < vec.length; i++) {
			numero = vec[i];
			if(i != vec.length-1) {
				for(int j = 0; j < vec.length; j++) {
					if(i == j) {
						j++;
					}
					if(numero == vec[j]) {
						resul = true;
					}
				}
			}
			else if(i == vec.length-1) {
				for(int j = 0; j < vec.length-1; j++) {
					if(numero == vec[j]) {
						resul = true;
					}
				}
			}
		}
		return resul;
	}
}

