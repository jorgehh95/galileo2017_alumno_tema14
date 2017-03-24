package tema14;

import java.util.Scanner;

public class ProbarExcepciones1 {
	public static void main(String[] args) {
		// BLOQUE 1
		Scanner teclado = new Scanner(System.in);
		int[] numeros=new int[10];
		boolean error;
		//int iNumero = numeros[10];
		int doble = 0;
		do {
			error = false;
			System.out.println("Teclea un numero");
			try {
				// BLOQUE 2
				String aNumero = teclado.nextLine();
				//iNumero = Integer.parseInt(aNumero);
				numeros[10]=Integer.parseInt(aNumero);
				doble = 2 * numeros[10];
			} catch (NumberFormatException e) {
				// BLOQUE 3
				System.out.println("Error, no ha tecleado bien");
				// e.printStackTrace();
				error = true;
			}catch(IndexOutOfBoundsException e){
				System.out.println("Error en el indice del array");
			}catch(Exception e){
				System.out.println(e);
			}
		} while (error == true);
		// BLOQUE 4
		System.out.println("El doble de " + numeros[10] + " es " + doble);
	}
}
