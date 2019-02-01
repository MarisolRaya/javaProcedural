package chars;

import libs.Input;

public class Ascii {
//Programa que imprime en pantalla el caracter  de acuerdo al código ascii que le corresponde, iniciando en 65
	public static void main(String[] args) {
	    //for (int i = 65; i < 65 + 26; i++)
	    	for (int i = 65; i < 91; i++)
	    {

	    	Input.print((char) i + " is " + i + "\n");
			//Input.print(i + " is " + i + "\n");
	    }

	}

}
