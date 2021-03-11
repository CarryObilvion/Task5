package sample;

import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import sample.Metods.*;

public class Controller {
    public Pane pane;
    Director direct = new Director();

    public void ClFin(ActionEvent actionEvent) {
        pane.getChildren().clear();
        Constructor constructor = new Constructor();
        constructor = direct.construct(new Finish());
        pane.getChildren().add(constructor);// добавление к панели pane
    }

    public void ClSt(ActionEvent actionEvent) {
        pane.getChildren().clear();
        Constructor constructor = new Constructor();
        constructor = direct.construct(new State());
        pane.getChildren().add(constructor);// добавление к панели pane
    }

    public void ClTr(ActionEvent actionEvent) {
        pane.getChildren().clear();
        Constructor constructor = new Constructor();
        constructor = direct.construct(new Transition());
        pane.getChildren().add(constructor);// добавление к панели pane
    }

    public void Clean(ActionEvent actionEvent) {
        pane.getChildren().clear();
    }
}
