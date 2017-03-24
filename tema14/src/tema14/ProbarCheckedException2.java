package tema14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbarCheckedException2 {

	public static FileWriter abrirFichero(String ruta) throws IOException{
		return new FileWriter(ruta);
	}

	public static void main(String[] args) throws IOException{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ruta del fichero donde vas a escribir");
		String ruta=teclado.nextLine();
		FileWriter fichero=null;
		fichero=abrirFichero(ruta);
		System.out.println("Texto que vas a escribir");
		String texto=teclado.nextLine();
		fichero.write(texto);
		fichero.close();
		
	}
}
