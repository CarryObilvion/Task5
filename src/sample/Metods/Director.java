package sample.Metods;

/**
 * Класс для построения конфигурации продуктов
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class Director {

    public Constructor construct(Builder builder) {
        builder.buildRring();
        builder.buildRing();
        builder.buildFCircl();
        builder.buildRect();
        builder.buildText();
        builder.buildLin();
        builder.buildArrow();
        return builder.getCon();
    }

}