package metodos;

/**
 *
 * @author GABRIELA
 */
public class ejecutarFactorial {

    public static void main(String[] args) {
        factorial obj = new factorial();

        obj.setnum(5);
        System.out.println(obj.getFactorial());
        System.out.println(obj.getFormula());
    }

}
