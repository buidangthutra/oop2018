
package week7.task1;

/**
 *
 * @author buidangthutra;
 */
public class Multiplication extends BinaryExpression {
    Expression left;
    Expression right;
    
    public Multiplication(Expression a, Expression b){
        this.left = a;
        this.right = b;
    }

    @Override
    public Expression left() {
       return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
       String a = Integer.toString(this.left.evaluate()+'*'+this.right.evaluate());
       return a;
    }

    @Override
    public int evaluate() {
       return this.left.evaluate()*this.right.evaluate();
    }
    
    
    public static void main(String[] args) {
        Multiplication a = new Multiplication(new Numeral(2),new Numeral(3));
        System.out.println(a.evaluate());
    }
}
