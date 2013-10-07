package edu.upc.eetac.dsa.rodrigo.Ejericios_tema3;

import Clases.CuentaAtras;
import Clases.CuentaRunnable;
import Clases.Ficheros;

public class clases_esenciales {

	public static void Ejericios2() {

		System.out
				.println("------------------------------------------------------");
		System.out.println("EX 1: ");
		System.out.println();

		String path = "/home/ropnom/dsa_proyects/Ejericios_tema3/";
		// EX 1, 2 ,3
		String Direccion = path + "Numeros.txt";
		Ficheros.LeerficheroPrint(Direccion);

		// EX 4 ejemplos de buffer reader y writer
		String Registro = path + "registro.txt";
		int caracteres = Ficheros.ContarCaracteres(Direccion);
		Ficheros.Escribirfichero(caracteres, "Numeros.txt", Registro, false);

		// EX 5 Ejemplos de buffer bytes
		String imagen = path + "Lena.jpg";
		int bytes = Ficheros.ContarBytes(imagen);
		System.out.println("La imagen " + imagen + " contiene : " + bytes
				+ " bytes.");
		Ficheros.Escribirfichero(bytes, "Lena.jpg", Registro, true);

		// EX 6 Ejemplo de Split
		Ficheros.FuncionEx6(Registro);

		// Ex 7 Ejemplos de Serializable
		Ficheros.Ex7();

		//ejecucionde 8 y 9 con modificaciones de 10
		
		// Ex 8 Ejmeplos clase thread
		CuentaAtras contador1 = new CuentaAtras("ID1", 5);
		CuentaAtras contador2 = new CuentaAtras("ID2", 7);
		CuentaAtras contador3 = new CuentaAtras("ID3", 11);

		contador1.start();
		contador2.start();
		contador3.start();

		// Ex 9 Ejemplos interface Runnable
		CuentaRunnable run1 = new CuentaRunnable("ID4", 7);
		CuentaRunnable run2 = new CuentaRunnable("ID5", 10);
		CuentaRunnable run3 = new CuentaRunnable("ID6", 9);
		
		try {
		(new Thread(run1)).start();
		(new Thread(run2)).start();
		(new Thread(run3)).start();
		} catch (Exception e) {
			// Printamos las excepciones que aparezcan
			e.printStackTrace();
	    }

		// EX 10
		//implementar modificaciones en ejericios 8-9
		

	}

}
