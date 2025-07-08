package Factory;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;

import java.util.Objects;

public class ShapeFactory {

    public ShapeFactory(String s)
    {
        if(s.equals( "circle"))
        {
            new Circle().draw();
        }
        else if(s.equals( "rectangle"))
        {
            new Rectangle().draw();
        }
        else if(s.equals( "square"))
        {
            new Square().draw();
        }
        else
        {
            new Circle().draw();
        }

    }

    public ShapeFactory ()
    {
        new Square().draw();
    }

}
