package loops;
import libs.Input;

public class Test {

    public static void main(String[] args) {
		System.out.print("¿Cuántos minutos tarda en la ducha?\n");
		float x = Input.get_float();
		System.out.print("Minutos:" + x+ "\n");
		System.out.print("Botellas:" + (x*12));
}


	}