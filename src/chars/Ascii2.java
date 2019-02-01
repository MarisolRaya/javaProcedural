package chars;

import libs.Input;

public class Ascii2 {
//Progama que imprime el codigo ascii de las letras del alfabeto, el ciclo for inicializa con la A hasta la Z
	// el print imprime el valor de C + la conversión en entero de la letra c
	public static void main(String[] args) {
		for (char c = 'A'; c <= 'Z'; c++)
	    {
	        Input.print(c + " is " + (int) c + "\n" );
	    }

	}

}
