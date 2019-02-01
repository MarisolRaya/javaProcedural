package conditionals;

import libs.Input;

public class Logical {
//Programa que evalua si quieres aprender java, introduciendo S s o N n, dependiendo la respuesta imprime una leyenda
	public static void main(String args[])
	{
		System.out.println("Vas a aprender java? s/n");
		int c = Input.get_char();
	    if (c == 'S' || c == 's')
	    {
	    	System.out.print("Si\n");
	    }
	    else if (c == 'N' || c == 'n')
	    {
	    	System.out.print("no\n");
	    }
	    else
	    {
	    	System.out.print("error\n");
	    }
	
	}
}



