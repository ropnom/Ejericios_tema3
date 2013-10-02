package Clases;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ficheros {

	static void CheckInt(int num) throws BigNumberException {
		if (num > 1000) {
			throw new BigNumberException(num);
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

	public static int ContarBytes(String direccion) {
		File archivo = null;
		InputStream fr = null;
		BufferedInputStream br = null;
		int count = 0;

		try {
			// abrimos el fichero
			archivo = new File(direccion);
			fr = new FileInputStream(archivo);
			// creamso un buffer para poder leer linea a linea
			br = new BufferedInputStream(fr);

			count = br.available();

		} catch (Exception e) {
			// Printamos las excepciones que aparezcan
			e.printStackTrace();
		} finally {
			// Cerramos el File
			try {
				if (null != fr) {
					fr.close();
				}
				if (null != br) {
					br.close();
				}
			} catch (Exception e2) {
				// printamos excepciones en el cierre del fichero
				e2.printStackTrace();
			}
		}
		
		return(count);
	}

	public static int ContarCaracteres(String Direccion) {

		FileReader archivo = null;
		BufferedReader br = null;
		String line = null;
		int cont = 0;

		try {

			archivo = new FileReader(Direccion);
			br = new BufferedReader(archivo);

			while ((line = br.readLine()) != null)
				cont += line.length();
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (null != br) {
					br.close();
				}
				if (null != archivo) {
					archivo.close();
				}
			} catch (Exception e2) {
				// printamos excepciones en el cierre del fichero
				e2.printStackTrace();
			}

		}

		return (cont);
	}

	public static void Escribirfichero(int caracteres, String nombre, String log) {
		FileWriter archivo = null;
		BufferedWriter bw = null;

		try {

			archivo = new FileWriter(log);
			bw = new BufferedWriter(archivo);

			Date dt = new Date();
			SimpleDateFormat format = new SimpleDateFormat(
					"dd/MM/yyyy HH:mm:ss");

			bw.write(format.format(dt) + " - " + caracteres + " - " + nombre);
			System.out.println("DEBUG: " + format.format(dt) + " - "
					+ caracteres + " - " + nombre);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (null != bw) {
					bw.close();
				}
				if (null != archivo) {
					archivo.close();
				}
			} catch (Exception e2) {
				// printamos excepciones en el cierre del fichero
				e2.printStackTrace();
			}
		}

	}
}
