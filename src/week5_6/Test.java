
package week5_6;

/**
 *
 * @author buidangthutra;
 */
public class Test {
    public static void main(String[] args) {
        Layer a = new Layer();
        a.shape.add(new Circle());
        a.shape.add(new Square());
        a.shape.add(new Rectangle());
        a.shape.add(new Triangle());
        a.shape.add(new Triangle());
        a.shape.add(new Triangle());

        Diagram b = new  Diagram();
	b.layer.add(a);
        
        System.out.println("Size Diagrame: ");
	System.out.print(b.layer.get(0).shape.size());
        System.out.println("");
        System.out.println("Number of delete Triangle:");
        System.out.println(b.layer.get(0).deteleteTriange());

    }
}
