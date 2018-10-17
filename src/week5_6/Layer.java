package week5_6;

/**
 *class Layer gom cac list shape
 * @author buidangthutra;
 */ 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class Layer {
ArrayList<Shape> shape = new ArrayList<Shape>();
public boolean visible;

/**
 *tra ve gia tri cho visible
 * @return tra ve gia tri visible
 */
public boolean getVisible(){
    return visible;
}

/**
 *gan gia tri cho visible
 * @param visible la bien boolean
 */
public void setVisible(boolean visible){
    this.visible = visible;
}
/**
 *ham xoa hinh tam giac
 * @return so luwong hinh duoc xoa
 */
public int deteleteTriange() {
	int result =0;

	for(int i=0;i<this.shape.size();i++) {
		if(shape.get(i) instanceof Triangle) { 
			shape.remove(i);
			result++;
                    i--;
 	}
        }
	return result;
}
/**
 *xoa hinh tron
 * @return so luong hinh duoc xoa
 */
public int deteleteCircle() {
	int result =0;
        for(int i=0;i<this.shape.size();i++) {
		if(shape.get(i) instanceof Circle) {
			shape.remove(i);
			result++;
			i--;
	}
	}
		return result;
	}


/**
 *ham xoa hinh giong nhaui ve canh va tao do
 */
public void deleteSameShape(){
    for(int i=0; i<shape.size();i++){
    if(shape.get(i) instanceof Circle){
        for(int j=0; j<shape.size()&&j!=i;j++){
            if( ((Circle)shape.get(i)).sameCircle((Circle)shape.get(j))){
                shape.remove(j);
            }
        }
        
    }
    if(shape.get(i) instanceof Rectangle){
        if(shape.get(i) instanceof Circle){
        for(int j=0; j<shape.size()&&j!=i;j++){
            if( ((Circle)shape.get(i)).sameCircle((Circle)shape.get(j))){
                shape.remove(j);
            }
        }
    }
    if(shape.get(i) instanceof Square){
        if(shape.get(i) instanceof Square){
        for(int j=0; j<shape.size()&&j!=i;j++){
            if( ((Square)shape.get(i)).sameRectangle((Square)shape.get(j))){
                shape.remove(j);
            }
        }
    }
    if(shape.get(i) instanceof Hexagon){
        if(shape.get(i) instanceof Hexagon){
        for(int j=0; j<shape.size()&&j!=i;j++){
            if( ((Hexagon)shape.get(i)).sameHexagon((Hexagon)shape.get(j))){
                shape.remove(j);
            }
        }
    }
    if(shape.get(i) instanceof Triangle){
        if(shape.get(i) instanceof Triangle){
        for(int j=0; j<shape.size()&&j!=i;j++){
            if( ((Triangle)shape.get(i)).sameTriangle((Triangle)shape.get(j))){
                shape.remove(j);
            }
        }
    }
}
}
    }}}}  }