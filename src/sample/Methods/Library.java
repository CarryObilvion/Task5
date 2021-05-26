package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.*;

public class Library implements Item {
    public void draw(GraphicsContext gc, Canvas canvas) {


        gc.fillRect(150, 120, 200, 100);
        gc.setFill(WHITE);
        gc.fillRect(157, 127, 186, 86);
        gc.setFill(BLACK);
        gc.strokeRect(151,140,198,60);
        gc.fillText("Библиотека", 215,175);







    }
}
