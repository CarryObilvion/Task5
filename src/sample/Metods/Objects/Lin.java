package sample.Metods.Objects;

import javafx.scene.shape.Line;

/**
 * Класс для отрисовки линии
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class Lin extends Line {
    /**
     * Этот метод отрисовывает фигуры, для анимации.
     * @param x1,y1,x2,y2 Значения, которые
     * требуется для обозначения координат фигуры.
     * @return Готовый рисунок.
     */
    public Lin(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    public Lin() {
        super(50, 50, 80, 50);
    }
}
