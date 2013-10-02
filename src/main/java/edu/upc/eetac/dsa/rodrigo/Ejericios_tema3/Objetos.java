package edu.upc.eetac.dsa.rodrigo.Ejericios_tema3;

import Clases.*;

public class Objetos {
	
	public static void ejericios1()
	{
		System.out.println( "------------------------------------------------------" );
		System.out.println( "EX 1: " );
		System.out.println( );
		
		Arbol arbol1 = new Arbol(4);
		Arbol arbol2 = new Arbol("Roble");
		Arbol arbol3 = new Arbol();
		Arbol arbol4 = new Arbol(5,"Pino");		
		
		System.out.println( );
		System.out.println( "------------------------------------------------------" );
		System.out.println( "EX 2: " );
		System.out.println( );
		
		Forma[] s = new Forma[3];
		s[0] = new Forma();
		// Circulo es tambien una Forma
		s[1] = new Circulo();
		// Cuadrado es tambien una Forma
		s[2] = new Cuadrado();
		for(int i = 0; i < s.length; i++)
		s[i].queEs();
		
		System.out.println( );		
		
	}

}
