
/**
 * Write a description of class ShapeFun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ShapeFun
{
    /**
     * Main method.
     * 
     * @param args not used
     */
    public static void main(String[] args)
    {
        Square square = new Square();
        square.makeVisible();
        square.moveHorizontal(50);
        square.moveVertical(50);
        square.changeSize(20);
        square.changeColor("green");
        
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
    }
}
