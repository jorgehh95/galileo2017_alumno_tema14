package tema14;

import java.util.Scanner;

public class ProbarMiExcepcion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("teclea un nombre");
		String nombre = teclado.nextLine();
		if (nombre.toUpperCase().equals("PEPE")) {
			try {
				throw new ExcepcionPepe();
			} catch (ExcepcionPepe e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("El nombre es " + nombre);

		}
	}

}
