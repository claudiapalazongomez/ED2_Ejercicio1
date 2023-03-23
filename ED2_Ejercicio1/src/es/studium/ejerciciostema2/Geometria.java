package es.studium.ejerciciostema2;

public class Geometria
{

	private static final double PI = 3.14;

	public static void main(String[] args)
	{
		Geometria g = new Geometria();
		
		int radio = 13; //refactor -> rename numero x radio
		longitudCircunferencia(radio);
		g.areaCirculo(radio);

	}

	public void areaCirculo(int radio) //si le quitamos el static debemos instanciar un objeto y llamar al área con el nombre del objeto
	{
		double area = PI * radio * radio; //refactor -> rename area
		System.out.println("La superficie del círculo es " + area);
	}

	public static void longitudCircunferencia(int radio) //refactor -> extract method
	{
		double longitud = 2 * PI * radio; //refactor -> extract constant 3.14 x PI (marcamos que sea para todo el programa, no solo una vez), refactor -> rename longitud
		System.out.println("El perímetro del círculo es " + longitud);
	}

}
