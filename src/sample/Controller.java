package sample;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import sample.Director.DirectorLibrary;
import sample.Director.DirectorModule;
import sample.Director.DirectorSubsystem;
import sample.Methods.*;

public class Controller {


    public Canvas can;
    public Object SimpleImageBuilder;
    public void libr(ActionEvent actionEvent) {
        GraphicsContext gc = can.getGraphicsContext2D(); // Получаем графический контент из канваса
        gc.clearRect(0, 0, can.getWidth(), can.getHeight()); // Очищаем канвас
        DirectorLibrary directorLibrary =  new DirectorLibrary();
        SimpleImageBuilder product = new SimpleImageBuilder();
        directorLibrary.build( product, gc, can);
    }

    public void subs(ActionEvent actionEvent) {
        GraphicsContext gc = can.getGraphicsContext2D();
        gc.clearRect(0, 0, can.getWidth(), can.getHeight());
        DirectorSubsystem director =  new DirectorSubsystem();
        SimpleImageBuilder product = new SimpleImageBuilder();
        director.build( product, gc, can);
    }

    public void module(ActionEvent actionEvent) {
        GraphicsContext gc = can.getGraphicsContext2D();
        gc.clearRect(0, 0, can.getWidth(), can.getHeight());
        DirectorModule director =  new DirectorModule();
        SimpleImageBuilder product = new SimpleImageBuilder();
        director.build( product, gc, can);
    }

    public void clean(ActionEvent actionEvent) {
        GraphicsContext gc = can.getGraphicsContext2D();
        gc.clearRect(0, 0, can.getWidth(), can.getHeight());
    }
}
