/*
 * Created on Mar 12, 2015
 *
 */
package fruit;

public class Apple {
    
    private String color;
    private int size;
    
    public Apple(String color, int size) {
        super();
        this.color = color;
        this.size = size;
    }
    
    public Apple() {
        super();
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

}
