package edu.upc.eetac.dsa.rodrigo.Ejericios_tema3;

import Clases.Ficheros;

public class clases_esenciales {
	
	public static void Ejericios2()
	{
		System.out.println( "------------------------------------------------------" );
		System.out.println( "EX 1: " );
		System.out.println( );
		
		String path = "/home/ropnom/dsa_proyects/Ejericios_tema3/";
		// EX 1, 2 ,3
		String Direccion = path + "Numeros.txt";
		Ficheros.LeerficheroPrint(Direccion);
		
		//EX 4
		String Registro = path + "registro.txt";
		int caracteres = Ficheros.ContarCaracteres(Direccion);
		Ficheros.Escribirfichero(caracteres, "Numeros.txt", Registro);
		
		//EX 5
		String imagen = path + "Lena.jpg";
		
	}

}
