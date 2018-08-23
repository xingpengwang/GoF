package gof.factoryPattern;

/**
 * Created by flh on 2018/8/23.
 */
public class FactoryPatternDemo
{
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
