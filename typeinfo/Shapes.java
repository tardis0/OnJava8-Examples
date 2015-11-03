// typeinfo/Shapes.java
import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  @Override
  abstract public String toString();
}

class Circle extends Shape {
  @Override
  public String toString() { return "Circle"; }
}

class Square extends Shape {
  @Override
  public String toString() { return "Square"; }
}

class Triangle extends Shape {
  @Override
  public String toString() { return "Triangle"; }
}

public class Shapes {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle()
    );
    for(Shape shape : shapeList)
      shape.draw();
  }
}
/* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*/
