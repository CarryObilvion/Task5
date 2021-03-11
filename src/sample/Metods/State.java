package sample.Metods;

import sample.Metods.Objects.Rect;
import sample.Metods.Objects.Texts;

/**
 * Класс для реализации конструирования
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class State implements Builder {
    private Constructor constructor;

    public State() {
        constructor = new Constructor();
    }

    @Override
    public void buildRring() {

    }

    @Override
    public void buildRing() {

    }

    @Override
    public void buildFCircl() {

    }

    @Override
    public void buildLin() {

    }

    @Override
    public void buildArrow() {

    }

    @Override
    public void buildRect() {
        Rect rect = new Rect();
        constructor.setRect(rect);
    }

    @Override
    public void buildText() {
        Texts t = new Texts();
        constructor.setTexts(t);
    }

    @Override
    public Constructor getCon() {
        return constructor;
    }

}
