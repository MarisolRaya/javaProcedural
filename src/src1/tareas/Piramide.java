package src1.tareas;

import libs.Input;

public class Piramide {

    public static void main(String[] args) {
        System.out.print("Ingrese la altura:\n");
        int altura = Input.get_int();

        for(int renglon= 1; renglon <= altura; renglon++){
            //System.out.println(renglon);
            String lineagato= "";
            String lineaespacio="";

            for (int gato=1;gato<=renglon +1;gato++ ){
                //lineaespacio= altura-lineagato;
                lineagato=lineagato+"#";
            }
            for(int espacios=altura-renglon; espacios>=1; espacios--){
                lineaespacio=lineaespacio+" ";
            }
            System.out.println(lineaespacio+lineagato);
        }
    }
}