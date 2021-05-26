package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.*;

public class Subsystem implements Item {
    public static final double CANVAS_HEIGHT = 425;
    public void draw(GraphicsContext gc, Canvas canvas) {


        gc.fillRect(150, 120, 200, 100);
        gc.setFill(WHITE);
        gc.fillRect(157, 127, 186, 86);
        gc.setFill(BLACK);
        gc.strokeRect(175,122,150,95);
        gc.fillText("Подсистема", 215,170);

    }
}
