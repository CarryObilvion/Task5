package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public interface ImageBuilder {
    public void buildLibrary(GraphicsContext gc, Canvas canvas);
    public void buildSubsystem(GraphicsContext gc, javafx.scene.canvas.Canvas
            canvas);
    public void buildModule(GraphicsContext gc, javafx.scene.canvas.Canvas canvas);


}