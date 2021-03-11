package sample.Metods.Objects;


import javafx.scene.text.Text;

/**
 * Класс для отрисовки текста
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class Texts extends Text {

    /**
     * Этот метод отрисовывает фигуры, для анимации.
     * @param x,y Значения, которые
     * требуется для обозначения координат фигуры.
     * @param s Значение текстового поля
     * @return Готовый рисунок.
     */
    public Texts(double x,double y, String s){
        super(x,y,s);
    }
    public Texts(){
        super(50,40,"State");
    }
}
