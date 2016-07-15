package metodos;

/**
 * @author GABRIELA
 */
public class Metodos3 {

    public static void main(String[] args) {
        //Operaciones y automaticanente s emuestra el resultado
        //resta(10, 4,2);
        //resta(15, 6, 3);
        //resta(5,2,4);
        
        System.out.println(resta(4,6,1));
        System.out.println(resta(10,5,2));

                System.out.println(Metodos.obtenerMayor(5,2));

    }

    static double resta(int a, int b, int c) {
        //DECLARACION DE VARIABLES
        double s = a - b- c;
         return s;

    }
}
