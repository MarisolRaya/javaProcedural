package conditionals;

import libs.Input;

public class Conditions {

	//Programa que evalua si un número entero es positivo mayor a 0, negativo menor a 0 y si es igual a 0
	public static void main(String args[])
	{
		System.out.println("Introduce un número:\n");
		int i = Input.get_int();
			if (i < 0)
			{
			System.out.print("negative\n");
		}
		else if (i > 0)
		{
			System.out.print("positive\n");
		}
		else
		{
			System.out.print("zero\n");
		}
	}
}
