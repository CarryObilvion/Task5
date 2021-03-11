package sample.Metods;

import sample.Metods.Objects.Arrow;
import sample.Metods.Objects.Lin;

/**
 * Класс для реализации конструирования
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class Transition implements Builder {
    private Constructor constructor;
    public Transition() {
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
        Lin lin = new Lin();
        constructor.setLin(lin);
    }

    @Override
    public void buildArrow() {
        Arrow arrow = new Arrow();
        constructor.setArrow(arrow);
    }

    @Override
    public void buildRect() {

    }

    @Override
    public void buildText() {

    }

    @Override
    public Constructor getCon() {
        return constructor;
    }

}
