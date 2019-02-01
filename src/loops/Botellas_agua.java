package loops;
import libs.Input;

public class Botellas_agua {
    public static void main(String[] args) {

        for(int num = 1; num <= 10 ; num += 1) {

            Input.print("Minutos:" + num +"\n");
            Input.print("Botellas:" + (num*12)+"\n\n");

        }

}
    }