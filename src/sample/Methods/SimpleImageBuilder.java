package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class SimpleImageBuilder implements ImageBuilder {
    private Image image;
    public SimpleImageBuilder(){
        this.image = new Image();
    }
    public void buildLibrary(GraphicsContext gc, Canvas canvas) {
        this.image.setLibrary(new Library());
        this.image.drawLibrary(gc,canvas);
    }

    public void buildSubsystem(GraphicsContext gc, Canvas canvas) {
        this.image.setSubsystem(new Subsystem());
        this.image.drawSubsystem(gc,canvas);
    }
    public void buildModule(GraphicsContext gc, Canvas canvas) {
        this.image.setModule(new Module());
        this.image.drawModule(gc,canvas);
    }
    public Image getImage() {
        return this.image;
    }
}