package week5_6;
/**
 *class Diagram 
 * @author buidangthutra;
 */
import java.util.ArrayList;


public class Diagram {
	
	public ArrayList<Layer> layer = new ArrayList<Layer>();
	// xoa hinh tron trong layer
	public int deleteCricle() {
		
		int result = 0;
		for(int i=0;i<layer.size();i++) {
			result=result+layer.get(i).deteleteCircle();
		}
	return result;
	}
/**
 *thay doi vi tri de cac hinh cung mot layer
 */
public void ChangeSameShape() {
        Layer cricles = new Layer();
        Layer squares = new Layer();
        Layer rectangles = new Layer();
        Layer hexagons = new Layer();
        Layer triangles = new Layer();
        for(int i=0;i<layer.size();i++) {
            for(int j=0;j<layer.get(i).shape.size();j++) {
                if(layer.get(i).shape.get(j) instanceof Circle)
                    cricles.shape.add(layer.get(i).shape.get(j));
                
                else if(layer.get(i).shape.get(j) instanceof Square)
                    squares.shape.add(layer.get(i).shape.get(j));
                
                else if(layer.get(i).shape.get(j) instanceof Rectangle)
                    rectangles.shape.add(layer.get(i).shape.get(j));
                
                else if(layer.get(i).shape.get(j) instanceof Triangle)
                    triangles.shape.add(layer.get(i).shape.get(j));
                
                else if(layer.get(i).shape.get(j) instanceof Hexagon)
                    hexagons.shape.add(layer.get(i).shape.get(j));
            }
        }
        this.layer.clear();
        this.layer.add(0, cricles);;
        this.layer.add(1, squares);;
        this.layer.add(2, rectangles);;
        this.layer.add(3, hexagons);;
        this.layer.add(4, triangles);;
    }
}
