package sample.Metods.Objects;

import javafx.scene.shape.Polygon;

/**
 * Класс для отрисовки стрелки
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class Arrow extends Polygon {
public Arrow(double points){
    super(points);
}
public Arrow(){
    super(80,40,80,60,90,50);
}
}
