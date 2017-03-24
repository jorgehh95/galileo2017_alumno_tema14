package tema14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbarCheckedException {

	public static FileWriter abrirFichero(String ruta) throws IOException {
		// try {
		return new FileWriter(ruta);
		// } catch (IOException ioex) {
		// Aquí capturamos cualquier excepción IOException que se lance
		// ioex.printStackTrace();
		// return null;
		// }
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ruta del fichero donde vas a escribir");
		String ruta = teclado.nextLine();
		FileWriter fichero = null;
		String texto = null;
		boolean errorRuta;
		do{
		errorRuta = false;
		// Abrimos el fichero en la ruta especificada
		try {
			fichero = abrirFichero(ruta);
			System.out.println("Texto que vas a escribir en el fichero");
			texto = teclado.nextLine();
			fichero.write(texto);
		} catch (IOException e1) {
			System.out.println("El fichero no ha sido abireto");
			errorRuta=true;
			System.out.println("Ruta del fichero donde vas a escribir");
			ruta = teclado.nextLine();
		}
		}while(errorRuta==true);
		
		try {
			fichero.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("El fichero no ha sido cerrado");
		}

	}
}
