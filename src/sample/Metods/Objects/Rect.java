package sample.Metods.Objects;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 * Класс для отрисовки прямоугольника
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */


public class Rect extends Rectangle {

    /**
     * Этот метод отрисовывает фигуры, для анимации.
     * @param w,h Значения, которые
     * требуется для обозначения координат фигуры.
     * @return Готовый рисунок.
     */

    public Rect(double w, double h, Paint fill) {
        super(w, h, fill);
    }

    public Rect() {
        super(120, 70, Color.AQUA);
    }
}
