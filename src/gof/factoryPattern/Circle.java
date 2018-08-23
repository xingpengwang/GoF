package gof.factoryPattern;

/**
 * Created by flh on 2018/8/23.
 */
public class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Inside Circle::draw() method.");
    }
}
