package sample.Metods;

import sample.Metods.Objects.FCircl;
import sample.Metods.Objects.Ring;
import sample.Metods.Objects.Rring;

/**
 * Класс для реализации конструирования
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class Finish implements Builder {
    private Constructor constructor;

    public Finish() {
        constructor = new Constructor();
    }

    @Override
    public void buildRring() {
        Rring r = new Rring();
        constructor.setRring(r);
    }

    @Override
    public void buildRing() {
        Ring r = new Ring();
        constructor.setRing(r);
    }

    @Override
    public void buildFCircl() {
        FCircl c = new FCircl();
        constructor.setFCircl(c);
    }

    @Override
    public void buildLin() {

    }

    @Override
    public void buildArrow() {

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