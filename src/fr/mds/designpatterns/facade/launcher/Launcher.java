package fr.mds.designpatterns.facade.launcher;

import fr.mds.designpatterns.facade.model.ShapeMaker;

/**
*
* @author tactfactory
*
* - Sans modifier le point d'entrée de l'application créer les classes nécessaire pour que le programme
*     affiche en sortie :
*         Circle::draw()
*         Rectangle::draw()
*         Circle::draw()
*         Circle::draw()
* - Vous devez résoudre cet exercice à l'aide du design pattern "Facade"
* - Vous devez créer les classes Rectangle, Square et Circle comme étant des Shape
*/
public class Launcher {
  public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();

    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();

    //Derive from facade use
/*    ShapeMaker maker = new ShapeMaker(ShapeMaker.CIRCLE);
    maker.draw();

    //Derive from facade use
    ShapeMaker maker1 = new ShapeMaker();
    maker1.draw(ShapeMaker.CIRCLE);*/
  }
}
