package fr.mds.designpatterns.facade.model;

public class Square implements Shape {


    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
