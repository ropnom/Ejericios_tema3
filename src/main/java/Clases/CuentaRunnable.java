package Clases;

public class CuentaRunnable implements Runnable {

	String ID;
	int valorinical;
	
	public CuentaRunnable(String iD, int valorinical) {
		super();
		ID = iD;
		this.valorinical = valorinical;
	}

	public void run() {
		// TODO Auto-generated method stub
				System.out.println("INICIO DEL RUNNABLE ID:" +ID+" CUENTA ATRAS DE "+valorinical);

				try {// si ocurre un error al dormir el proceso(sleep(999))

					for (;;) {// inicio del for infinito
						if (valorinical != 0) {// si no es el ultimo segundo
							valorinical--; // decremento el numero de segundos
						} else {

							break;// seacabo el tiempo fin hilo

						}

						System.out.println("ID Runnable: " + ID + " Cuenta Atras: "
								+ valorinical);// Muestro en pantalla el temporizador
						Thread.sleep(995);// Duermo el hilo durante 999 milisegundos

					}
				} catch (Exception e) {
					// Printamos las excepciones que aparezcan
					e.printStackTrace();
				} finally {
					System.out.println("FIN DEL RUNNABLE ID:" +ID);

				}
		
	}
	
	

}
