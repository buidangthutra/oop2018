package week7.task1;

public class Addition extends BinaryExpression {
    
    Expression left;
    Expression right;

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
       String a = Integer.toString(left.evaluate()+right.evaluate());
       return a;
    }

    @Override
    public int evaluate() {
        return this.left.evaluate()+this.right.evaluate();
    }
    
    public Addition(){
        
    }
    
    public Addition(Expression a, Expression b){
        this.left = a;
        this.right = b;
    }
    
}
