package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.*;

public class Module implements Item {
    public void draw(GraphicsContext gc, Canvas canvas) {
        gc.fillRect(150, 120, 200, 100);
        gc.setFill(WHITE);
        gc.fillRect(157, 127, 186, 86);
        gc.setFill(BLACK);
        gc.strokeRect(167,140,165,60);
        gc.fillText("Модуль", 230,175);



    }
}
