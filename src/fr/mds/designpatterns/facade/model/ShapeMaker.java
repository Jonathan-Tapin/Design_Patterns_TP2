package fr.mds.designpatterns.facade.model;

import java.util.Arrays;
import java.util.List;

public class ShapeMaker {

 public static final Shape CIRCLE = new Circle() ;

 private List<Shape> shapes = Arrays.asList(new Circle(), new Rectangle(), new Square());

/* public ShapeMaker(ShapeMaker CIRCLE) {

 }*/

 public void drawCircle() {
     Shape circle = shapes.stream().filter(x -> x.getClass().getSimpleName().equals("Circle")).findFirst().get();
     circle.draw();
    }

    public void drawSquare() {
     Shape square = shapes.stream().filter(x -> x.getClass().getSimpleName().equals("Square")).findFirst().get();
     square.draw();
    }
    public void drawRectangle() {
     Shape rectangle = shapes.stream().filter(x -> x.getClass().getSimpleName().equals("Rectangle")).findFirst().get();
     rectangle.draw();
    }
}
