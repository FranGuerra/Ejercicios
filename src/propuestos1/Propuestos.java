package propuestos1;

import java.io.*; //Para InputStreamReader, IOException
import java.util.*; // Para Scanner [Aquí también está java.util.Arrays]

public class Propuestos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio Propuesto 1
		Propuestos.NuloPositivoNegativo();
		//Ejercicio Propuesto 2
		Propuestos.SumaRestaProductoDivision();
		//Ejercicio Propuesto 8
		Propuestos.Potencia();
		//Ejercicio Propuesto 8 con función recursiva
		/*
		int base, exponente;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la base: ");
		base = s.nextInt();
		System.out.println("Introduce el exponente: ");
		exponente = s.nextInt();
		s.close();
		System.out.println("La potencia es: " + Propuestos.PotenciaRecursividad(base, exponente));
		*/
		//Ejercicio Propuesto 11
		System.out.println("El número de cifras es: " + Propuestos.Cifras());
		//Ejercicio Propuesto 15
		Propuestos.PerteneceFibonacci();
		//Ejercicio Propuesto 16
		System.out.println(Propuestos.Fibonacci(10));
		Propuestos.PruebaArrays();

	}
	
	public static void NuloPositivoNegativo () {
		/*
		 * Ejercicio Propuesto 1
		 * Realizar un algoritmo que lea un número y compruebe si dicho número es nulo,
		 * positivo o negativo.
		 */
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		System.out.println("Introduce un número: ");
		
		try {
			String entrada = br.readLine();
			int numero = Integer.parseInt(entrada);
			if(numero == 0) {
				System.out.println("El número introducido es nulo");
			}
			else if(numero < 0) {
				System.out.println("El número introducido es negativo");
			}
			else if (numero > 0) {
				System.out.println("El número introducido en positivo");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Debe introducir un número");
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
	}
	
	public static void SumaRestaProductoDivision() {
		/*
		 * Ejercicio Propuesto 2
		 * Realiza un algoritmo que lea dos números y calcule su suma, resta del mayor menos
		 * el menor, producto y división del mayor entre el menor.
		 */
		int num1, num2, temp, resultado;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num1 = s.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = s.nextInt();
		s.close();
		
		if(num1 < num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;	
		}
		resultado = num1 + num2;
		System.out.println("La suma de los números es: " + resultado);
		resultado = num1 - num2;
		System.out.println("La resta de los números es: " + resultado);
		resultado = num1 * num2;
		System.out.println("El producto de los números es: " + resultado);
		resultado = num1/num2;
		System.out.println("La división de los números es: " + resultado);
	}
	
	public static void Potencia() {
		/*
		 * Ejercicio Propuesto 8
		 * Realiza un algoritmo que dados dos números correspondientes a la base y
		 * el exponente calcule la potencia asociada.
		 */
		int base, exponente, resultado, temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la base: ");
		base = s.nextInt();
		resultado = base;
		System.out.println("Introduce el exponente: ");
		exponente = s.nextInt();
		s.close();
		for(int i = 1; i < exponente; i++) {
			temp = resultado;
			resultado = temp * base;
		}
		System.out.println("La potencia es: " + resultado);
	}
	
	public static int PotenciaRecursividad(int base, int exponente) {
		//Ejercicio Propuesto 8 (versión recursiva)
		if(exponente == 0) {
			return 1;
		}
		else {
			return base*PotenciaRecursividad(base, exponente-1);
		}
	}
	
	public static int Cifras() {
		/*
		 * Ejercicio Propuesto 11
		 * Escribe un algoritmo que imprima el número de cifras de un determinado número que
		 * será introducido por teclado
		 */
		int cifras=0;
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Introduce un número: ");
			int numero = s.nextInt();
			s.close();
			String c = Integer.toString(numero);
			cifras = c.length();
		}
		catch(InputMismatchException e) {
			/*
			 * el método nextInt() parece quedarse fuera de rango rápidamente
			 * por lo que no acepta números grandes. Ver especificaciones de Integer
			 * en Java
			 */
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		return cifras;
	}
	
	public static void PerteneceFibonacci() {
		/*
		 * Ejercicio Propuesto 15
		 * Realiza un algoritmo que determine si un número dado pertenece o no a la 
		 * serie de Fibonacci
		 * 
		 * fib(0) = 0						si n = 0
		 * fib(1) = 1						si n = 1
		 * fib(n) = fib(n-1) + fib(n-2)		en otro caso
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = s.nextInt();
		s.close();
		int a=0,b=1,c=1;
		while(numero > c) {
			c = a + b;
			a = b;
			b = c;
			if(numero == c) {
				System.out.println("El número pertenece a la serie de Fibonacci");
			}
		}
		if(numero < c) {
			System.out.println("El número no pertence a la serie de Fibonacci");
		}
	}
	
	public static int Fibonacci(int n) {
		/*
		 * Ejercicio Propuesto 16
		 * Realiza un algoritmo que calcule los diez primeros números de la serie de
		 * Fibonacci, sabiendo que cada número se obtiene de la suma de los 
		 * dos anteriores
		 * 
		 * fib(0) = 0						si n = 0
		 * fib(1) = 1						si n = 1
		 * fib(n) = fib(n-1) + fib(n-2)		en otro caso
		 */
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}

	public static void PruebaArrays() {
		
		String[] testArray = new String[4];
		System.out.println(java.util.Arrays.toString(testArray));
		testArray[0] = "Nadal";
		testArray[1] = "Muller";
		testArray[2] = "Wimbledon";
		testArray[3] = "Rolex";
		System.out.println(Arrays.toString(testArray));
		
		int[] testArrayInt = new int[10];
		for (int i = 0; i < 10; i++) {
			testArrayInt[i] = i + 1;
		}
		System.out.println(Arrays.toString(testArrayInt));
	}

}
