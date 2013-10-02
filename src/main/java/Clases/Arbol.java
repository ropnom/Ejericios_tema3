package Clases;

public class Arbol {
		
	int altura;
	String tipo;
	
	
	public Arbol()
	{
		this.tipo = "Un árbol Generico";
		Write(this.tipo);
	}
	public Arbol(int altura)
	{
		this.altura = altura;
		String a = "Un árbol de "+ altura+" metros.";
		Write(a);
	}
	public Arbol(String tipo)
	{
		this.tipo= tipo;
		String a = "Un " + tipo;
		Write(a);
	}
	public Arbol(int altura, String tipo)
	{
		this.tipo= tipo;
		this.altura = altura;
		String a = "Un " + tipo+ " de "+ altura +" metros";
		Write(a);
	}
	
	
	private void Write(String salida)
	{
		System.out.println( salida);
	}

}
