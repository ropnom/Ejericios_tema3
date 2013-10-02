package Clases;

import java.io.*;

public class Ficheros {

	static void CheckInt(int num) throws BigNumberException {
		if (num > 1000) {
			throw new BigNumberException();
		}
	}

	public static void LeerficheroPrint(String Direccion) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// abrimos el fichero
			archivo = new File(Direccion);
			fr = new FileReader(archivo);
			// creamso un buffer para poder leer linea a linea
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			int i = 0;
			while ((linea = br.readLine()) != null) {
				try {
					int a = Integer.parseInt(linea);
					CheckInt(a);
					System.out.println("Linea:" + i + " Numero: " + a);
				} catch (BigNumberException e3) {
					e3.printStackTrace();
				}

				i++;
			}
		} catch (Exception e) {
			// Printamos las excepciones que aparezcan
			e.printStackTrace();
		} finally {
			// Cerramos el File
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				// printamos excepciones en el cierre del fichero
				e2.printStackTrace();
			}
		}
	}

	public static void Escribirfichero(int caracteres, String nombre)
	{
		DataOutputStream miDataStream;
	    FileOutputStream miFileStream;
	    BufferedOutputStream miBufferStream;

	    // Obtiene un controlador de fichero
	    miFileStream = new FileOutputStream( "/home/ropnom/dsa_proyects/Ejericios_tema3/registro.txt" );
	    // Encadena un stream de salida con buffer (por eficiencia)
	    miBufferStream = new BufferedOutputStream( miFileStream );
	    // Encadena un fichero de salida de datos
	    miDataStream = new DataOutputStream( miBufferStream );

	    // Ahora se pueden utilizar los dos streams de entrada para
	    // acceder al fichero (si se quiere)
	    Date
	    String fecha = "";
	    String nombre = "";
	    miBufferStream.write( fecha );
	    miDataStream.writeInt( caracteres );
	    miBufferStream.write( nombre);

	    // Cierra el fichero de datos explícitamente. Siempre se cierra 
	    // primero el fichero stream de mayor nivel
	    miDataStream.close();
	    miBufferStream.close();
	    miFileStream.close();
		
	}
}
