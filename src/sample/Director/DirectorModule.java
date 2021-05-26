package sample.Director;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import sample.Methods.ImageBuilder;

public class DirectorModule {
    public void build(ImageBuilder builder, GraphicsContext gc, Canvas canvas){
        builder.buildModule(gc, canvas);

    }
}
