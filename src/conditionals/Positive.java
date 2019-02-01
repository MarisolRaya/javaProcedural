package conditionals;

import libs.Input;
//Programa que valida si el num que se ingresó es menor que 1, en caso de que no, imprime que es un entero positivo
public class Positive {

	public static void main(String args[])
	{
		int i = get_positive_int();
		System.out.print(i + " is a positive integer\n");
	}

	public static int get_positive_int()
	{
	    int n;
	    do
	    {
	    	System.out.print("n is ");
	        n = Input.get_int();
	    }
	    while (n < 1);
	    return n;
	}
}


