
package metodos;

/**
 *
 * @author GABRIELA
 */
public class factorial {
    int fact =1;
    int num;
    String formula = "";
    
   public  void setnum (int n){
    num = n;
    
    for (int cont = 0; cont >1; cont++){
        fact= fact * cont;
        
        formula +=Integer.toHexString(cont)+ "x";
        
                
    }
    formula += "1";
    
}
   public int getFactorial(){
        return fact;
}
    String getFormula(){
        return formula;
    }
}
