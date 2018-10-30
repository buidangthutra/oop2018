package week7.task1;

public class Square extends Expression {
    Expression expression;

    @Override
    public String toString() {
         String a = Integer.toString(expression.evaluate()+'^'+'2');
         return a;
    }

    @Override
    public int evaluate() {
        return this.expression.evaluate()*this.expression.evaluate();
    }
    
    public Square(Expression a){
       expression  = a;
    }
    
}
