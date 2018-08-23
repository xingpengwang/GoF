package gof.factoryPattern;

/**
 * Created by flh on 2018/8/23.
 */
public class ShapeFactory
{
    public Shape getShape(String shapeType)
    {
        if(shapeType == null){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }
        if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        return null;
    }
}
