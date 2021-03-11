package sample.Metods.Objects;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 * Класс для отрисовки круга
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class FCircl extends Circle {
    /**
     * Этот метод отрисовывает фигуры, для анимации.
     * @param x,y,radius Значения, которые
     * требуется для обозначения координат фигуры.
     * @return Готовый рисунок.
     */


    public FCircl(double x, double y,double radius, Paint fill) {

        super(x,y,radius, fill);
    }
    public FCircl() {
        super(40,50,10, Color.BLACK);
    }
}
