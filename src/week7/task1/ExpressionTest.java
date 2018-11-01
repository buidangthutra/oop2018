
package week7.task1;

/**
 *
 * @author buidangthutra;
 */
public class ExpressionTest {
    public static void main(String[] args) {

       Square s = new Square(new Numeral(10));
       Multiplication m = new Multiplication(new Numeral(2),new Numeral(3));
       Subtration sup = new Subtration(s,new Numeral(1));
       Addition ad = new Addition(sup,m);
       Square re = new Square(ad);
        System.out.println(re.evaluate());
        
        try{
            Division d = new Division(new Numeral(5),new Numeral(0));
        }
        catch(ArithmeticException e){
            System.out.println("Loi chia cho 0");
        }
    }
}
